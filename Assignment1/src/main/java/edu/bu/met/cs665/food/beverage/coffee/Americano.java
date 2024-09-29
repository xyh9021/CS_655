/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: Americano.java
 * Description: This class represents an Americano beverage, which extends the Beverage class
 * and sets the specific attributes for an Americano.
 */

package edu.bu.met.cs665.food.beverage.coffee;

import edu.bu.met.cs665.food.beverage.Beverage;

/**
 * This is the Americano class.
 * This class extends the Beverage class and represents an Americano beverage.
 */
public class Americano extends Beverage {

  /**
   * Constructor for creating an Americano object.
   * Sets the name, price, milk units, and sugar units specific to an Americano beverage.
   */
  public Americano() {
    this.name = "Americano";
    this.price = 2.4;
    this.milkUnit = 0;
    this.sugarUnit = 0;
  }
}
