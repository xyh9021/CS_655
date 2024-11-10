/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: CustomerDataViaHttps.java
 * Description: This interface defines the contract for retrieving and displaying customer data
 * using HTTPS communication. Classes implementing this interface must provide methods for
 * retrieving customer data and printing customer details.
 */

package edu.bu.met.cs665.contracts;

import edu.bu.met.cs665.Customer;

/**
 * This is CustomerDataViaHttps interface.
 * It provides methods for retrieving customer data and printing customer information
 * via HTTPS.
 */
public interface CustomerDataViaHttps {

  /**
   * Prints customer information based on the provided customer ID.
   *
   * @param customerId the ID of the customer to print
   */
  void printCustomer(int customerId);

  /**
   * Retrieves customer information based on the provided customer ID via HTTPS.
   *
   * @param customerId the ID of the customer to retrieve
   * @return a Customer object if found, otherwise null
   */
  Customer getCustomerDataViaHttps(int customerId);
}
