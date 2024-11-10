/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: CustomerData.java
 * Description: This interface defines the contract for retrieving customer data.
 * Classes implementing this interface must provide an implementation for retrieving
 * customer information based on a customer ID.
 */

package edu.bu.met.cs665.contracts;

import edu.bu.met.cs665.Customer;

/**
 * This is CustomerData interface.
 * It provides a method to retrieve customer information by customer ID.
 */
public interface CustomerData {

  /**
   * Retrieves customer information based on the provided customer ID.
   *
   * @param customerId the ID of the customer to retrieve
   * @return a Customer object if found, otherwise null
   */
  Customer getCustomerData(int customerId);
}
