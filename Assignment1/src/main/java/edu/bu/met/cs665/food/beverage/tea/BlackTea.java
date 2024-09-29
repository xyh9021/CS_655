/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: BlackTea.java
 * Description: This class represents a Black Tea beverage, which extends the Beverage class
 * and sets the specific attributes for a Black Tea.
 */

package edu.bu.met.cs665.food.beverage.tea;

import edu.bu.met.cs665.food.beverage.Beverage;

/**
 * This is the BlackTea class.
 * This class extends the Beverage class and represents a Black Tea beverage.
 */
public class BlackTea extends Beverage {

  /**
   * Constructor for creating a Black Tea object.
   * Sets the name, price, milk units, and sugar units specific to a Black Tea beverage.
   */
  public BlackTea() {
    this.name = "BlackTea";
    this.price = 2.0;
    this.milkUnit = 0;
    this.sugarUnit = 0;
  }
}
