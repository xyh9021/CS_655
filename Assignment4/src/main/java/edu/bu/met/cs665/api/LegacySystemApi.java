/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: LegacySystemApi.java
 * Description: This class simulates a legacy system that stores customer data
 * and retrieves it via USB. It implements the CustomerDataViaUsb interface,
 * allowing interaction with customer data using USB-based methods.
 */

package edu.bu.met.cs665.api;

import edu.bu.met.cs665.Customer;
import edu.bu.met.cs665.contracts.CustomerDataViaUsb;
import java.util.HashMap;

/**
 * This is LegacySystemApi class.
 * This class provides methods to store and retrieve customer data through a legacy system
 * that uses USB as its data communication method.
 */
public class LegacySystemApi implements CustomerDataViaUsb {
  private final HashMap<Integer, Customer> customers;

  /**
   * Constructor for LegacySystemApi.
   * Initializes the customer data storage using a HashMap.
   */
  public LegacySystemApi() {
    customers = new HashMap<Integer, Customer>();
  }

  /**
   * Adds a customer to the legacy system.
   *
   * @param c the Customer object to be added
   */
  public void addCustomer(Customer c) {
    customers.put(c.getId(), c);
  }

  /**
   * Prints customer information based on the provided customer ID.
   * If the customer is found, their details are printed.
   * Otherwise, a message indicating the customer was not found is displayed.
   *
   * @param customerId the ID of the customer to print
   */
  @Override
  public void printCustomer(int customerId) {
    Customer customer = getCustomerDataViaUsb(customerId);
    if (customer == null) {
      System.out.println("Can't find customer with id " + customerId);
    } else {
      System.out.println("id:" + customerId +  "name: " + customer.getName());
    }
  }

  /**
   * Retrieves customer information based on the provided customer ID via USB.
   *
   * @param customerId the ID of the customer to retrieve
   * @return a Customer object if found, otherwise null
   */
  @Override
  public Customer getCustomerDataViaUsb(int customerId) {
    return customers.get(customerId);
  }
}
