/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: GreenTea.java
 * Description: This class represents a Green Tea beverage, which extends the Beverage class
 * and sets the specific attributes for a Green Tea.
 */

package edu.bu.met.cs665.food.beverage.tea;

import edu.bu.met.cs665.food.beverage.Beverage;

/**
 * This is the GreenTea class.
 * This class extends the Beverage class and represents a Green Tea beverage.
 */
public class GreenTea extends Beverage {

  /**
   * Constructor for creating a Green Tea object.
   * Sets the name, price, milk units, and sugar units specific to a Green Tea beverage.
   */
  public GreenTea() {
    this.name = "GreenTea";
    this.price = 1.8;
    this.milkUnit = 0;
    this.sugarUnit = 0;
  }
}