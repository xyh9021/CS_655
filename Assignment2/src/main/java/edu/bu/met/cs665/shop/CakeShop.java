/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/12/2024
 * File Name: CakeShop.java
 * Description: This class represents a cake shop that
 * can create delivery requests and broadcast it.
 */

package edu.bu.met.cs665.shop;

import edu.bu.met.cs665.DeliveryRequest;
import edu.bu.met.cs665.driver.DeliveryAbility;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the CakeShop class.
 * The CakeShop class create delivery requests and broadcast it.
 */
public class CakeShop implements DeliveryAble {
  // The name of the cake shop
  private String shopName;
  // The address of the cake shop
  private String shopAddress;
  // A list of delivery drivers associated with the shop
  private List<DeliveryAbility> drivers = new ArrayList<DeliveryAbility>();

  /**
   * Constructor for CakeShop.
   * @param shopName The name of the cake shop
   * @param shopAddress The address of the cake shop
   */
  public CakeShop(String shopName, String shopAddress) {
    this.shopName = shopName;
    this.shopAddress = shopAddress;
    drivers = new ArrayList<>();
  }

  /**
   * Getter for the shop address.
   * @return The address of the cake shop
   */
  public String getShopAddress() {
    return shopAddress;
  }

  /**
   * Setter for the shop address.
   * @param shopAddress The new address of the cake shop
   */
  public void setShopAddress(String shopAddress) {
    this.shopAddress = shopAddress;
  }

  /**
   * Getter for the shop name.
   * @return The name of the cake shop
   */
  public String getShopName() {
    return shopName;
  }

  /**
   * Setter for the shop name.
   * @param shopName The new name of the cake shop
   */
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  /**
   * Getter for the list of drivers.
   * @return The list of drivers associated with the cake shop
   */
  public List<DeliveryAbility> getDrivers() {
    return drivers;
  }

  /**
   * Setter for the list of drivers.
   * @param drivers The new list of drivers for the cake shop
   */
  public void setDrivers(List<DeliveryAbility> drivers) {
    this.drivers = drivers;
  }

  /**
   * Adds a delivery driver to the list of drivers for the cake shop.
   * @param driver The driver to be added
   */
  @Override
  public void addDriver(DeliveryAbility driver) {
    drivers.add(driver);
  }

  /**
   * Removes a delivery driver from the list of drivers for the cake shop.
   * @param driver The driver to be removed
   */
  @Override
  public void removeDriver(DeliveryAbility driver) {
    drivers.remove(driver);
  }

  /**
   * Creates a delivery request for the cake shop.
   * This method generates a new delivery request,
   * including the order details, customer information,
   * and the current date and time for the request.
   *
   * @param orderNumber The order number
   * @param deliverPrice The delivery price
   * @param customerAddress The customer's address
   * @param customerName The customer's name
   * @param customerPhone The customer's phone number
   * @return A new DeliveryRequest object containing the details of the delivery
   */
  @Override
  public DeliveryRequest creatDeliveryRequest(int orderNumber, int deliverPrice,
                                              String customerAddress, String customerName,
                                              String customerPhone) {
    // Get the current date and time
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String time = currentDateTime.format(formatter);
    // Return a new DeliveryRequest object
    return new DeliveryRequest(orderNumber, deliverPrice, customerAddress, customerName,
      customerPhone, getShopAddress(), getShopName(), time);
  }

  /**
   * Broadcasts a delivery request to all drivers associated with the cake shop.
   * This method sends the delivery request to all registered drivers
   * by calling their `update()` method.
   *
   * @param deliveryRequest The delivery request to broadcast to all drivers
   */
  @Override
  public void broadcast(DeliveryRequest deliveryRequest) {
    for (DeliveryAbility driver : drivers) {
      driver.update(deliveryRequest);
    }
  }
}