package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import edu.bu.met.cs665.driver.DeliveryAbility;
import edu.bu.met.cs665.driver.FreelanceVan;
import edu.bu.met.cs665.driver.Scooter;
import edu.bu.met.cs665.driver.Taxi;
import edu.bu.met.cs665.shop.CakeShop;
import edu.bu.met.cs665.shop.DeliveryAble;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestAge {
    private DeliveryAble cakeShop;
    private DeliveryAbility driver1;
    private DeliveryAbility driver2;
    private DeliveryAbility driver3;
    private DeliveryAbility driver4;
    private DeliveryAbility driver5;
    private DeliveryRequest deliveryRequest;
    public TestAge() {
        cakeShop = new CakeShop("Sweet Treats", "123 Bakery Lane");
        driver1 = new FreelanceVan("Jack");
        driver2 = new Scooter("John");
        driver3 = new Taxi("James");
        driver4 = new Scooter("Olivia");
        driver5 = new Scooter("Emma");

        driver1.addShop(cakeShop);
        driver2.addShop(cakeShop);
        driver3.addShop(cakeShop);
        driver4.addShop(cakeShop);
        driver5.addShop(cakeShop);
    }

    @Test
    public void testShopCreateDeliveryRequest() {

        deliveryRequest = cakeShop.creatDeliveryRequest(
          12345,
          50,
          "456 Customer Rd",
          "John Doe",
          "123-456-7890"
        );

        assertEquals(12345, deliveryRequest.getOrderNumber());
        assertEquals(50, deliveryRequest.getDeliverPrice());
        assertEquals("456 Customer Rd", deliveryRequest.getCustomerAddress());
        assertEquals("John Doe", deliveryRequest.getCustomerName());
        assertEquals("123-456-7890", deliveryRequest.getCustomerPhone());
    }

    @Test
    public void testShowDetail() {
        deliveryRequest = new DeliveryRequest(
          12345, // orderNumber
          50,    // deliverPrice
          "123 Main St",  // customerAddress
          "John Doe",     // customerName
          "123-456-7890", // customerPhone
          "456 Shop Rd",  // shopAddress
          "Best Shop",    // shopName
          "2024-10-10 15:45:30" // orderTime
        );
        String expectedOutput = "Order Number: 12345\n" +
          "Deliver Price: 50\n" +
          "Customer Address: 123 Main St\n" +
          "Customer Name: John Doe\n" +
          "Customer Phone: 123-456-7890\n" +
          "Shop Address: 456 Shop Rd\n" +
          "Shop Name: Best Shop\n" +
          "Order Time: 2024-10-10 15:45:30";
        String actualOutput = deliveryRequest.showDetail();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testDriverUpdate() {
        deliveryRequest = new DeliveryRequest(
          12345,            // orderNumber
          5,               // deliverPrice
          "160 Comm St",     // customerAddress
          "Benny",        // customerName
          "123-456-7890",    // customerPhone
          "456 Ave Rd",     // shopAddress
          "Stop And Shop",       // shopName
          "2024-10-10 15:45:30" // orderTime
        );
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        driver1.update(deliveryRequest);

        String expectedOutput = "Jack(car type: FreelanceVan) received deliveryRequest form Stop And Shop\n" +
          "Order Number: 12345\n" +
          "Deliver Price: 5\n" +
          "Customer Address: 160 Comm St\n" +
          "Customer Name: Benny\n" +
          "Customer Phone: 123-456-7890\n" +
          "Shop Address: 456 Ave Rd\n" +
          "Shop Name: Stop And Shop\n" +
          "Order Time: 2024-10-10 15:45:30\n";

        String actualOutput = outContent.toString();

        expectedOutput = expectedOutput.replaceAll("\\r\\n", "\n");
        actualOutput = actualOutput.replaceAll("\\r\\n", "\n");

        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void testBroadcast() {

        deliveryRequest = cakeShop.creatDeliveryRequest(
          12345,
          50,
          "456 Customer Rd",
          "John Doe",
          "123-456-7890"
        );

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        cakeShop.broadcast(deliveryRequest);

        String actualOutput = outContent.toString();
        assertTrue(actualOutput.contains("Jack"));
        assertTrue(actualOutput.contains("John"));
        assertTrue(actualOutput.contains("James"));
        assertTrue(actualOutput.contains("Olivia"));
        assertTrue(actualOutput.contains("Emma"));
    }


}
