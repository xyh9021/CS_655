/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: YellowTea.java
 * Description: This class represents a Yellow Tea beverage, which extends the Beverage class
 * and sets the specific attributes for a Yellow Tea.
 */

package edu.bu.met.cs665.food.beverage.tea;

import edu.bu.met.cs665.food.beverage.Beverage;

/**
 * This is the YellowTea class.
 * This class extends the Beverage class and represents a Yellow Tea beverage.
 */
public class YellowTea extends Beverage {

  /**
   * Constructor for creating a Yellow Tea object.
   * Sets the name, price, milk units, and sugar units specific to a Yellow Tea beverage.
   */
  public YellowTea() {
    this.name = "YellowTea";
    this.price = 2.2;
    this.milkUnit = 0;
    this.sugarUnit = 0;
  }
}