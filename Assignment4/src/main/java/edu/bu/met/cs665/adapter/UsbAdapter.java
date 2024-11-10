/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: UsbAdapter.java
 * Description: This class implements the Adapter design pattern to adapt a
 * CustomerDataViaUsb API to the CustomerData interface. It allows the system
 * to work with USB-based customer data sources seamlessly.
 */

package edu.bu.met.cs665.adapter;

import edu.bu.met.cs665.Customer;
import edu.bu.met.cs665.contracts.CustomerData;
import edu.bu.met.cs665.contracts.CustomerDataViaUsb;

/**
 * This is UsbAdapter class.
 * This class acts as an adapter to bridge the gap between CustomerDataViaUsb
 * and the CustomerData interface.
 */
public class UsbAdapter implements CustomerData {
  private final CustomerDataViaUsb api;

  /**
   * Constructor for UsbAdapter.
   * Initializes the adapter with a specific CustomerDataViaUsb instance.
   *
   * @param api the CustomerDataViaUsb instance to be adapted
   */
  public UsbAdapter(CustomerDataViaUsb api) {
    this.api = api;
  }

  /**
   * Retrieves customer information based on the provided customer ID.
   * This method adapts the getCustomerDataViaUsb method from the
   * CustomerDataViaUsb interface to the getCustomerData method
   * in the CustomerData interface.
   *
   * @param customerId the ID of the customer to retrieve
   * @return a Customer object if found, otherwise null
   */
  @Override
  public Customer getCustomerData(int customerId) {
    return api.getCustomerDataViaUsb(customerId);
  }
}
