package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import edu.bu.met.cs665.adapter.HttpsAdapter;
import edu.bu.met.cs665.adapter.UsbAdapter;
import edu.bu.met.cs665.api.LegacySystemApi;
import edu.bu.met.cs665.api.NewSystemApi;
import edu.bu.met.cs665.contracts.CustomerData;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestAge {
    private LegacySystemApi legacySystemApi;
    private NewSystemApi newSystemApi;
    private MySystem mySystem;

    public TestAge() {

    }
    @Before
    public void setUp() {
        legacySystemApi = new LegacySystemApi();
        newSystemApi = new NewSystemApi();
        legacySystemApi.addCustomer(new Customer(101, "Alice"));
        legacySystemApi.addCustomer(new Customer(102, "Bob"));
        legacySystemApi.addCustomer(new Customer(103, "Charlie"));
        legacySystemApi.addCustomer(new Customer(104, "David"));
        legacySystemApi.addCustomer(new Customer(105, "Eve"));
        newSystemApi.addCustomer(new Customer(201, "Fred"));
        newSystemApi.addCustomer(new Customer(202, "George"));
        newSystemApi.addCustomer(new Customer(203, "Henry"));
        newSystemApi.addCustomer(new Customer(204, "John"));
        newSystemApi.addCustomer(new Customer(205, "Jack"));
        List<CustomerData> list = new ArrayList<CustomerData>();
        list.add(new UsbAdapter(legacySystemApi));
        list.add(new HttpsAdapter(newSystemApi));
        mySystem = new MySystem(list);
    }

    @Test
    public void testLegacySystemApi() {
        Customer customer = new Customer(1, "John Doe");
        legacySystemApi.addCustomer(customer);
        Customer retrievedCustomer = legacySystemApi.getCustomerDataViaUsb(1);
        assertEquals("Customer ID should match", 1, retrievedCustomer.getId());
        assertEquals("Customer name should match", "John Doe", retrievedCustomer.getName());
    }

    @Test
    public void testNewSystemApi() {
        Customer customer = new Customer(1, "John Doe");
        newSystemApi.addCustomer(customer);
        Customer retrievedCustomer = newSystemApi.getCustomerDataViaHttps(1);
        assertEquals("Customer ID should match", 1, retrievedCustomer.getId());
        assertEquals("Customer name should match", "John Doe", retrievedCustomer.getName());
    }

    @Test
    public void testMySystemGetCustomerDataFromLegacySystemApi() {
        Customer customer = mySystem.getCustomerData(101);
        assertEquals("Customer name should match", "Alice", customer.getName());
    }

    @Test
    public void testMySystemGetCustomerDataFromNewsSystemApi() {
        Customer customer = mySystem.getCustomerData(201);
        assertEquals("Customer name should match", "Fred", customer.getName());
    }

    @Test
    public void testMySystemGetCustomerDataNotFound() {
        Customer customer = mySystem.getCustomerData(999);
        assertNull("Customer should be null for non-existent ID", customer);
    }


}
