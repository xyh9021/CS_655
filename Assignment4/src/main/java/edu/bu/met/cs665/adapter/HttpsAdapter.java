/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: HttpsAdapter.java
 * Description: This class implements the Adapter design pattern to adapt a
 * CustomerDataViaHttps API to the CustomerData interface. It allows the system
 * to work with HTTPS-based customer data sources seamlessly.
 */

package edu.bu.met.cs665.adapter;

import edu.bu.met.cs665.Customer;
import edu.bu.met.cs665.contracts.CustomerData;
import edu.bu.met.cs665.contracts.CustomerDataViaHttps;

/**
 * This is HttpsAdapter class.
 * This class acts as an adapter to bridge the gap between CustomerDataViaHttps
 * and the CustomerData interface.
 */
public class HttpsAdapter implements CustomerData {
  private final CustomerDataViaHttps api;

  /**
   * Constructor for HttpsAdapter.
   * Initializes the adapter with a specific CustomerDataViaHttps instance.
   *
   * @param api the CustomerDataViaHttps instance to be adapted
   */
  public HttpsAdapter(CustomerDataViaHttps api) {
    this.api = api;
  }

  /**
   * Retrieves customer information based on the provided customer ID.
   * This method adapts the getCustomerDataViaHttps method from the
   * CustomerDataViaHttps interface to the getCustomerData method
   * in the CustomerData interface.
   *
   * @param customerId the ID of the customer to retrieve
   * @return a Customer object if found, otherwise null
   */
  @Override
  public Customer getCustomerData(int customerId) {
    return api.getCustomerDataViaHttps(customerId);
  }
}