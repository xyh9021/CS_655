/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: Beverage.java
 * Description: This class represents a generic Beverage, implementing the Food interface
 * and providing attributes for name, price, milk units, and sugar units.
 */

package edu.bu.met.cs665.food.beverage;

import edu.bu.met.cs665.food.Food;

/**
 * This is the Beverage class.
 * This class implements the Food interface and represents a generic beverage with attributes
 * such as name, price, milk units, and sugar units.
 */
public class Beverage implements Food {
  protected String name;
  protected double price;
  protected int milkUnit;
  protected int sugarUnit;

  /**
   * Provides a description of the beverage including the number of milk and sugar units.
   *
   * @return a string describing the beverage with milk and sugar units
   */
  @Override
  public String getDescription() {
    return name + " with " + milkUnit + " milk unit and " + sugarUnit + " sugar unit.";
  }

  /**
   * Calculates the total price of the beverage including the cost of added milk and sugar units.
   *
   * @return the total price of the beverage
   */
  @Override
  public double getPrice() {
    return price + milkUnit * 0.5 + sugarUnit * 0.5;
  }

  /**
   * Sets the number of milk units for the beverage.
   * It ensures the milk unit is between 0 and 3.
   *
   * @param milkUnit the number of milk units to add (must be between 0 and 3)
   */
  public void setMilkUnit(int milkUnit) {
    if (milkUnit < 0) {
      System.out.println("Can't add less than 0 milk unit");
    } else if (milkUnit > 3) {
      System.out.println("Can't add more than 3 milk unit");
    } else {
      this.milkUnit = milkUnit;
    }
  }

  /**
   * Sets the number of sugar units for the beverage.
   * It ensures the sugar unit is between 0 and 3.
   *
   * @param sugarUnit the number of sugar units to add (must be between 0 and 3)
   */
  public void setSugarUnit(int sugarUnit) {
    if (sugarUnit < 0) {
      System.out.println("Can't add less than 0 sugar unit");
    } else if (sugarUnit > 3) {
      System.out.println("Can't add more than 3 sugar unit");
    } else {
      this.sugarUnit = sugarUnit;
    }
  }
}
