/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: Espresso.java
 * Description: This class represents an Espresso beverage, which extends the Beverage class
 * and sets the specific attributes for an Espresso.
 */

package edu.bu.met.cs665.food.beverage.coffee;

import edu.bu.met.cs665.food.beverage.Beverage;

/**
 * This is the Espresso class.
 * This class extends the Beverage class and represents an Espresso beverage.
 */
public class Espresso extends Beverage {

  /**
   * Constructor for creating an Espresso object.
   * Sets the name, price, milk units, and sugar units specific to an Espresso beverage.
   */
  public Espresso() {
    this.name = "Espresso";
    this.price = 3.0;
    this.milkUnit = 0;
    this.sugarUnit = 0;
  }
}
