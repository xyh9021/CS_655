/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: MySystem.java
 * Description: This class integrates multiple customer data sources and provides
 * functionality to retrieve and print customer information. It implements the
 * CustomerData interface to retrieve customer details from multiple APIs.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.contracts.CustomerData;
import java.util.List;

/**
 * This is MySystem class.
 * It aggregates multiple CustomerData sources (APIs) and provides methods to retrieve
 * and display customer information.
 */
public class MySystem implements CustomerData {
  private final List<CustomerData> api;

  /**
   * Constructor for MySystem.
   * Initializes the system with a list of customer data sources.
   *
   * @param api the list of CustomerData sources to be used
   */
  public MySystem(List<CustomerData> api) {
    this.api = api;
  }

  /**
   * Prints customer information based on the provided customer ID.
   * If the customer is found in any of the data sources, their details are printed.
   * Otherwise, a message indicating that the customer was not found is displayed.
   *
   * @param customerId the ID of the customer to print
   */

  public void printCustomer(int customerId) {
    Customer customer = getCustomerData(customerId);
    if (customer == null) {
      System.out.println("Can't find customer with id " + customerId);
    } else {
      System.out.println("id:" + customerId +  "name: " + customer.getName());
    }
  }

  /**
   * Retrieves customer information based on the provided customer ID.
   * It queries all aggregated data sources to find the customer.
   *
   * @param customerId the ID of the customer to retrieve
   * @return a Customer object if found, otherwise null
   */
  @Override
  public Customer getCustomerData(int customerId) {
    for (CustomerData i : api) {
      Customer customer = i.getCustomerData(customerId);
      if (customer != null) {
        return customer;
      }
    }
    return null;
  }

}
