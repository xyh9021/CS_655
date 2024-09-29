/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: VendingMachine.java
 * Description: This class represents a Vending Machine
 * that handles the process of ordering food items.
 * It maps food items to their corresponding cookers and manages cooking in test or normal mode.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.cooker.CookAbility;
import edu.bu.met.cs665.food.Food;
import java.util.HashMap;

/**
 * This is the VendingMachine class.
 * This class manages the process of ordering food items
 * and cooking them using the appropriate cookers.
 */
public class VendingMachine {

  // The cooker used for preparing the food
  private CookAbility cooker;
  // Flag to indicate whether the machine is in test mode
  private boolean testMode = false;
  // A map that associates food items with their corresponding cookers
  private static final HashMap<String, CookAbility> foodToCookerMap;
  // Static block to initialize the foodToCookerMap with cookers from a properties file

  static {
    foodToCookerMap = HelperFunction.getFoodToCookerMap(
      "./src/main/java/edu/bu/met/cs665/properties/foodToCooker.properties");
  }

  /**
   * Orders a food item by its name.
   * If the item exists, the appropriate cooker prepares it. If not, an error message is displayed.
   *
   * @param name the name of the food item to order
   * @return the cooked Food object, or null if the item is not available
   */
  public Food order(String name) {
    Food food = null;
    if (setCooker(name)) {
      cooker.setTestMode(testMode);
      food = cooker.cook(name);
    } else {
      System.out.println("We don't have this food or Your spelling is wrong!");
    }
    return food;
  }

  /**
   * Sets the cooker based on the provided food name.
   *
   * @param name the name of the food item
   * @return true if the cooker was found and set, false otherwise
   */
  private boolean setCooker(String name) {
    cooker = foodToCookerMap.get(name);
    return cooker != null;
  }

  /**
   * Enables or disables test mode for the vending machine.
   * In test mode, the cooking process may differ for testing purposes.
   *
   * @param testMode true to enable test mode, false to disable it
   */
  public void setTestMode(boolean testMode) {
    this.testMode = testMode;
  }
}
