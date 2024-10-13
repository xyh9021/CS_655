/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/12/2024
 * File Name: DeliveryAbility.java
 * Description: This interface defines the methods for drivers.
 */

package edu.bu.met.cs665.driver;

import edu.bu.met.cs665.DeliveryRequest;
import edu.bu.met.cs665.shop.DeliveryAble;

/**
 * This is the DeliveryAbility interface.
 * It defines the methods for adding and removing shops and
 * updating the driver with new delivery requests.
 */
public interface DeliveryAbility {
  /**
   * Adds a shop to the driver delivery system.
   *
   * @param shop The shop to be added
   */
  public void addShop(DeliveryAble shop);

  /**
   * Removes a shop from the driver delivery system.
   *
   * @param shop The shop to be removed
   */
  public void removeShop(DeliveryAble shop);

  /**
   * Updates the driver with a new delivery request.
   * This method is called when there is a new delivery request that the driver needs to handle.
   *
   * @param deliveryRequest The delivery request to be processed by the driver
   */
  public void update(DeliveryRequest deliveryRequest);
}
