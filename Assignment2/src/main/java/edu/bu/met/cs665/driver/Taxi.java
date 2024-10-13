/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/12/2024
 * File Name: Taxi.java
 * Description: This class represents taxi driver.
 */

package edu.bu.met.cs665.driver;

import edu.bu.met.cs665.DeliveryRequest;
import edu.bu.met.cs665.shop.DeliveryAble;
import java.util.ArrayList;
import java.util.List;

/**
 * The Taxi class represents a taxi driver.
 * It implements the DeliveryAbility interface, allowing it to
 * manage shops and process delivery requests.
 */
public class Taxi implements DeliveryAbility {
  // The name of the driver
  private String name;
  // The type of car used for delivery
  private String carType;
  // A list of shops that the driver want to deliver for.
  private List<DeliveryAble> shops;

  /**
   * Constructor for Taxi.
   * @param name The name of the taxi driver
   */
  public Taxi(String name) {
    this.name = name;
    this.carType = "Taxi";
    shops = new ArrayList<DeliveryAble>();
  }

  /**
   * Gets the name of the driver.
   *
   * @return The name of the driver
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the driver.
   *
   * @param name The new name for the driver
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the type of car used for delivery.
   *
   * @return The car type
   */
  public String getCarType() {
    return carType;
  }

  /**
   * Sets the type of car used for delivery.
   *
   * @param carType The new car type
   */
  public void setCarType(String carType) {
    this.carType = carType;
  }

  /**
   * Gets the list of shops which the driver deliver for.
   *
   * @return A list of DeliveryAble shops
   */
  public List<DeliveryAble> getShops() {
    return shops;
  }

  /**
   * Sets the list of shops which the driver deliver for.
   *
   * @param shops A new list of shops for the van
   */
  public void setShops(List<DeliveryAble> shops) {
    this.shops = shops;
  }

  /**
   * Adds a shop to thi list that driver want to deliver for.
   *
   * @param shop The shop to add
   */
  @Override
  public void addShop(DeliveryAble shop) {
    shops.add(shop);
    shop.addDriver(this);
  }

  /**
   * Removes a shop to thi list that driver want to deliver for.
   *
   * @param shop The shop to remove
   */
  @Override
  public void removeShop(DeliveryAble shop) {
    shops.remove(shop);
    shop.removeDriver(this);
  }

  /**
   * Updates a new delivery request and displays the details.
   * This method is called when there is a new delivery request.
   *
   * @param deliveryRequest The delivery request to process
   */
  @Override
  public void update(DeliveryRequest deliveryRequest) {
    System.out.println(name + "(car type: " + carType + ") received deliveryRequest form "
        + deliveryRequest.getShopName());
    deliveryRequest.showDetail();
  }
}
