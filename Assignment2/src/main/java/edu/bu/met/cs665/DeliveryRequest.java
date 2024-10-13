/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/12/2024
 * File Name: DeliveryRequest.java
 * Description: This class represents a delivery request,
 * containing all necessary details about an order.
 */

package edu.bu.met.cs665;

/**
 * This is the DeliveryRequest class.
 * It holds information related to a delivery order.
 */
public class DeliveryRequest {
  private int orderNumber;
  private int deliverPrice;
  private String customerAddress;
  private String customerName;
  private String customerPhone;
  private String shopAddress;
  private String shopName;
  private String orderTime;

  /**
   * Constructor for the DeliveryRequest class.
   * This constructor initializes all the fields required for a delivery request.
   *
   * @param orderNumber The order number
   * @param deliverPrice The price for the delivery
   * @param customerAddress The address of the customer
   * @param customerName The name of the customer
   * @param customerPhone The phone number of the customer
   * @param shopAddress The address of the shop
   * @param shopName The name of the shop
   * @param orderTime The time the order was placed
   */
  public DeliveryRequest(int orderNumber, int deliverPrice, String customerAddress,
                         String customerName, String customerPhone, String shopAddress,
                         String shopName, String orderTime) {
    this.orderNumber = orderNumber;
    this.deliverPrice = deliverPrice;
    this.customerAddress = customerAddress;
    this.customerName = customerName;
    this.customerPhone = customerPhone;
    this.shopAddress = shopAddress;
    this.shopName = shopName;
    this.orderTime = orderTime;
  }

  /**
   * Gets the shop's name.
   *
   * @return The name of the shop
   */
  public String getShopName() {
    return shopName;
  }

  /**
   * Sets the shop's name.
   *
   * @param shopName The name of the shop to set
   */
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  /**
   * Gets the shop's address.
   *
   * @return The address of the shop
   */
  public String getShopAddress() {
    return shopAddress;
  }

  /**
   * Sets the shop's address.
   *
   * @param shopAddress The address of the shop to set
   */
  public void setShopAddress(String shopAddress) {
    this.shopAddress = shopAddress;
  }

  /**
   * Gets the order time.
   *
   * @return The time the order was placed
   */
  public String getOrderTime() {
    return orderTime;
  }

  /**
   * Sets the order time.
   *
   * @param orderTime The time the order was placed to set
   */
  public void setOrderTime(String orderTime) {
    this.orderTime = orderTime;
  }

  /**
   * Gets the customer's address.
   *
   * @return The address of the customer
   */
  public String getCustomerAddress() {
    return customerAddress;
  }

  /**
   * Sets the customer's address.
   *
   * @param customerAddress The address of the customer to set
   */
  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }

  /**
   * Gets the customer's name.
   *
   * @return The name of the customer
   */
  public String getCustomerName() {
    return customerName;
  }

  /**
   * Sets the customer's name.
   *
   * @param customerName The name of the customer to set
   */
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  /**
   * Gets the customer's phone number.
   *
   * @return The phone number of the customer
   */
  public String getCustomerPhone() {
    return customerPhone;
  }

  /**
   * Sets the customer's phone number.
   *
   * @param customerPhone The phone number of the customer to set
   */
  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  /**
   * Gets the delivery price.
   *
   * @return The price for the delivery
   */

  public int getDeliverPrice() {
    return deliverPrice;
  }

  /**
   * Sets the delivery price.
   *
   * @param deliverPrice The price for the delivery to set
   */
  public void setDeliverPrice(int deliverPrice) {
    this.deliverPrice = deliverPrice;
  }

  /**
   * Gets the order number.
   *
   * @return The order number
   */
  public int getOrderNumber() {
    return orderNumber;
  }

  /**
   * Sets the order number.
   *
   * @param orderNumber The order number to set
   */
  public void setOrderNumber(int orderNumber) {
    this.orderNumber = orderNumber;
  }

  /**
   * Displays the details of the delivery request.
   * This method prints and returns the details of the delivery request as a formatted string.
   *
   * @return A formatted string containing all the details of the delivery request
   */
  public String showDetail() {
    String res = "Order Number: " + orderNumber + "\n"
        + "Deliver Price: " + deliverPrice + "\n"
        + "Customer Address: " + customerAddress + "\n"
        + "Customer Name: " + customerName + "\n"
        + "Customer Phone: " + customerPhone + "\n"
        + "Shop Address: " + shopAddress + "\n"
        + "Shop Name: " + shopName + "\n"
        + "Order Time: " + orderTime;
    System.out.println(res);
    return res;
  }
}
