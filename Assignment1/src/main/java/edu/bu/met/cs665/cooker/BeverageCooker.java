/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: BeverageCooker.java
 * Description: This class is responsible for managing the cooking process of beverages.
 */

package edu.bu.met.cs665.cooker;

import edu.bu.met.cs665.HelperFunction;
import edu.bu.met.cs665.food.Food;
import edu.bu.met.cs665.food.beverage.Beverage;
import java.util.HashMap;

/**
 * This is the BeverageCooker class.
 * This class is responsible for representing a cooker for preparing beverages.
 */
public class BeverageCooker implements CookAbility {

  // A static map to hold the beverage name and its corresponding class name
  private static final HashMap<String, String> map;
  // A flag to indicate whether the class is in test mode
  private boolean testMode = false;

  // Static block to initialize the map with beverage properties
  static {
    map = HelperFunction.getFoodMap(
      "./src/main/java/edu/bu/met/cs665/properties/beverage.properties");
  }

  /**
   * Inner static class to implement the Singleton pattern for BeverageCooker.
   */
  private static class BeverageCookerHolder {
    private static final BeverageCooker INSTANCE = new BeverageCooker();
  }

  /**
   * Method to get the single instance of BeverageCooker.
   *
   * @return the singleton instance of BeverageCooker
   */
  public static BeverageCooker getInstance() {
    return BeverageCookerHolder.INSTANCE;
  }

  /**
   * The cook method for preparing a beverage by its name.
   *
   * @param name the name of the beverage to cook
   * @return the cooked beverage as a Food object, or null if not found
   */
  @Override
  public Food cook(String name) {
    String className = map.get(name);
    if (className == null) {
      System.out.println("No such beverage: " + name
          + ". Please check if you spelled it correctly!");
      return null;
    }
    try {
      Class<?> clazz = Class.forName(className);
      Beverage beverage = (Beverage) clazz.newInstance();
      add(beverage);
      return (Food) beverage;
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      System.out.println("Cooker Error!");
    }
    return null;
  }

  /**
   * Adds milk and sugar units to the beverage.
   * If testMode is true, sets milk to 1 unit and sugar to 2 units.
   * Otherwise, prompts user input for milk and sugar units.
   *
   * @param beverage the beverage to which milk and sugar are added
   */
  private void add(Beverage beverage) {
    if (testMode) {
      beverage.setMilkUnit(1);
      beverage.setSugarUnit(2);
    } else {
      System.out.println("How many milk unit do you want to add beverage?(0-3)");
      Integer num = HelperFunction.getInt(0, 3);
      beverage.setMilkUnit(num);
      System.out.println("How many sugar unit do you want to add beverage?(0-3)");
      num = HelperFunction.getInt(0, 3);
      beverage.setSugarUnit(num);
    }
  }

  /**
   * Setter method to enable or disable test mode.
   *
   * @param testMode true to enable test mode, false to disable
   */
  public void setTestMode(boolean testMode) {
    this.testMode = testMode;
  }
}
