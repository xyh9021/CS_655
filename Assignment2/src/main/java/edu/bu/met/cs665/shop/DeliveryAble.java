/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/12/2024
 * File Name: DeliveryAble.java
 * Description: This interface defines the methods for
 * managing delivery drivers and handling delivery requests.
 */

package edu.bu.met.cs665.shop;

import edu.bu.met.cs665.DeliveryRequest;
import edu.bu.met.cs665.driver.DeliveryAbility;

/**
 * This is the DeliveryAble interface for shop.
 * It defines the methods for adding and removing drivers, creating delivery requests,
 * and broadcasting those requests to all drivers.
 */
public interface DeliveryAble {
  /**
   * Adds a driver to the delivery system.
   *
   * @param driver The delivery driver to be added
   */
  void addDriver(DeliveryAbility driver);

  /**
   * Removes a driver from the delivery system.
   *
   * @param driver The delivery driver to be removed
   */
  void removeDriver(DeliveryAbility driver);

  /**
   * Creates a new delivery request.
   *
   * @param orderNumber The order number
   * @param deliverPrice The price of the delivery service
   * @param customerAddress The address of the customer
   * @param customerName The name of the customer
   * @param customerPhone The phone number of the customer
   * @return A DeliveryRequest object containing the details of the delivery
   */
  DeliveryRequest creatDeliveryRequest(int orderNumber, int deliverPrice, String customerAddress,
                                       String customerName, String customerPhone);

  /**
   * Broadcasts a delivery request to all registered drivers.
   *
   * @param deliveryRequest The delivery request to be broadcasted
   */
  void broadcast(DeliveryRequest deliveryRequest);
}