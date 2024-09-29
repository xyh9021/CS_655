/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: Food.java
 * Description: This interface defines the structure for Food objects,
 * including methods for getting descriptions and prices.
 */

package edu.bu.met.cs665.food;

/**
 * This is the Food interface.
 * Classes implementing this interface should provide details about the food,
 * including a description and price.
 */
public interface Food {

  /**
   * Provides a description of the food.
   *
   * @return a string containing the description of the food
   */
  String getDescription();

  /**
   * Retrieves the price of the food.
   *
   * @return the price of the food as a double
   */
  double getPrice();
}
