package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.factory.*;
import org.junit.Test;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestAge {

    public TestAge() {
    }

    @Test
    public void testGenerateBusinessEmail() {
        EmailCreator emailCreator = new EmailCreator();
        emailCreator.setFactory(new BusinessEmailFactory());
        Email email = emailCreator.generateEmail("John Smith", "john.smith@gmail.com");
        assertEquals("Business", email.getCustomerType());
        assertEquals("John Smith", email.getCustomerName());
        assertEquals("john.smith@gmail.com", email.getCustomerEmailAddress());
    }

    @Test
    public void testGenerateReturningEmail() {
        EmailCreator emailCreator = new EmailCreator();
        emailCreator.setFactory(new ReturningEmailFactory());
        Email email = emailCreator.generateEmail("Emily Johnson", "emily.johnson@gmail.com");
        assertEquals("Returning", email.getCustomerType());
        assertEquals("Emily Johnson", email.getCustomerName());
        assertEquals("emily.johnson@gmail.com", email.getCustomerEmailAddress());
    }

    @Test
    public void testGenerateFrequentEmail() {
        EmailCreator emailCreator = new EmailCreator();
        emailCreator.setFactory(new FrequentEmailFactory());
        Email email = emailCreator.generateEmail("Michael Brown", "michael.brown@gmail.com");
        assertEquals("Frequent", email.getCustomerType());
        assertEquals("Michael Brown", email.getCustomerName());
        assertEquals("michael.brown@gmail.com", email.getCustomerEmailAddress());
    }

    @Test
    public void testGenerateNewEmail() {
        EmailCreator emailCreator = new EmailCreator();
        emailCreator.setFactory(new NewEmailFactory());
        Email email = emailCreator.generateEmail("Sarah Davis", "sarah.davis@gmail.com");
        assertEquals("New", email.getCustomerType());
        assertEquals("Sarah Davis", email.getCustomerName());
        assertEquals("sarah.davis@gmail.com", email.getCustomerEmailAddress());
    }

    @Test
    public void testGenerateVipEmail() {
        EmailCreator emailCreator = new EmailCreator();
        emailCreator.setFactory(new VipEmailFactory());
        Email email = emailCreator.generateEmail("David Wilson", "david.wilson@gmail.com");
        assertEquals("VIP", email.getCustomerType());
        assertEquals("David Wilson", email.getCustomerName());
        assertEquals("david.wilson@gmail.com", email.getCustomerEmailAddress());
    }

    @Test
    public void testEmailShow() {
        EmailCreator emailCreator = new EmailCreator();
        emailCreator.setFactory(new BusinessEmailFactory());
        Email email = emailCreator.generateEmail("Benny", "123@outlook.com");

        assertEquals("title: Dear business customer: Benny\n" +
          "body: ", email.show());
    }

    @Test
    public void testEmailSend() {
        EmailCreator emailCreator = new EmailCreator();
        emailCreator.setFactory(new BusinessEmailFactory());
        Email email = emailCreator.generateEmail("Benny", "123@outlook.com");

        assertEquals("Send email to Business Benny 123@outlook.com", email.send());
    }

}
