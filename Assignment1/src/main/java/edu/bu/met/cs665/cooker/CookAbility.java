/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: CookAbility.java
 * Description: This interface defines the cook ability that a class should implement
 * to be able to cook food items.
 */

package edu.bu.met.cs665.cooker;

import edu.bu.met.cs665.food.Food;

/**
 * This is the CookAbility interface.
 * Classes implementing this interface should be capable of cooking food.
 */
public interface CookAbility {

  /**
   * Method to cook a food item by its name.
   *
   * @param name the name of the food to cook
   * @return the cooked food item as a Food object
   */
  Food cook(String name);

  /**
   * Method to enable or disable test mode for the cooking process.
   *
   * @param testMode true to enable test mode, false to disable
   */
  void setTestMode(boolean testMode);
}
