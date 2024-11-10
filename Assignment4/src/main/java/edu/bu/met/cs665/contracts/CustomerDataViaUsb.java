/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: CustomerDataViaUsb.java
 * Description: This interface defines the contract for retrieving and displaying customer data
 * using USB communication. Classes implementing this interface must provide methods for
 * retrieving customer data and printing customer details.
 */

package edu.bu.met.cs665.contracts;

import edu.bu.met.cs665.Customer;

/**
 * This is CustomerDataViaUsb interface.
 * It provides methods for retrieving customer data and printing customer information
 * via USB.
 */
public interface CustomerDataViaUsb {

  /**
   * Prints customer information based on the provided customer ID.
   *
   * @param customerId the ID of the customer to print
   */
  void printCustomer(int customerId);

  /**
   * Retrieves customer information based on the provided customer ID via USB.
   *
   * @param customerId the ID of the customer to retrieve
   * @return a Customer object if found, otherwise null
   */
  Customer getCustomerDataViaUsb(int customerId);
}
