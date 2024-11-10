/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: Customer.java
 * Description: This class represents a Customer with a unique ID and a name.
 * It provides methods to access the customer's name and ID.
 */

package edu.bu.met.cs665;

/**
 * This is Customer class.
 * It encapsulates customer information, including a unique ID and a name.
 */
public class Customer {
  private final String name;
  private final int id;

  /**
   * Constructor for Customer.
   * Initializes a customer with the specified ID and name.
   *
   * @param id   the unique ID of the customer
   * @param name the name of the customer
   */
  Customer(int id, String name) {
    this.name = name;
    this.id = id;
  }

  /**
   * Gets the name of the customer.
   *
   * @return the name of the customer
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the unique ID of the customer.
   *
   * @return the ID of the customer
   */
  public int getId() {
    return id;
  }
}
