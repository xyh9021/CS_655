/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: LatteMacchiato.java
 * Description: This class represents a Latte Macchiato beverage, which extends the Beverage class
 * and sets the specific attributes for a Latte Macchiato.
 */

package edu.bu.met.cs665.food.beverage.coffee;

import edu.bu.met.cs665.food.beverage.Beverage;

/**
 * This is the LatteMacchiato class.
 * This class extends the Beverage class and represents a Latte Macchiato beverage.
 */
public class LatteMacchiato extends Beverage {

  /**
   * Constructor for creating a Latte Macchiato object.
   * Sets the name, price, milk units, and sugar units specific to a Latte Macchiato beverage.
   */
  public LatteMacchiato() {
    this.name = "LatteMacchiato";
    this.price = 3.6;
    this.milkUnit = 0;
    this.sugarUnit = 0;
  }
}

