/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/28/2024
 * File Name: HelperFunction.java
 * Description: This class provides utility functions
 * that include reading integer input from the user,
 * loading properties files, and mapping food items to their corresponding cookers.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.cooker.CookAbility;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

/**
 * This is the HelperFunction class.
 * This class provides static utility methods for input handling and loading properties files.
 */
public class HelperFunction {

  /**
   * Reads an integer input from the user within a specified range.
   *
   * @param min the minimum acceptable value
   * @param max the maximum acceptable value
   * @return the integer entered by the user within the specified range
   */
  public static Integer getInt(int min, int max) {
    Integer inputNumber = null;
    Scanner scanner = new Scanner(System.in);
    while (true) {
      if (scanner.hasNextInt()) {
        inputNumber = scanner.nextInt();
        if (inputNumber >= min && inputNumber <= max) {
          break;
        } else {
          System.out.println("Please enter Integer from " + min + " to " + max);
        }
      } else {
        System.out.println("Please enter a Integer number.");
        scanner.next();
      }
    }
    return inputNumber;
  }

  /**
   * Loads properties from a file and returns them as a HashMap.
   * The properties file should contain keys representing food items
   * and values representing the class names.
   *
   * @param url the file path of the properties file
   * @return a HashMap containing food item names as keys and corresponding class names as values
   */
  public static HashMap<String, String> getFoodMap(String url) {
    HashMap<String, String> map = new HashMap<String, String>();
    Properties p = new Properties();
    try (InputStream input = Files.newInputStream(Paths.get(url))) {
      p.load(input);
      Set<Object> keys = p.keySet();
      for (Object key : keys) {
        String className = p.getProperty((String) key);
        map.put((String) key, className);
      }
    } catch (Exception e) {
      System.out.println("Can't load properties file!");
    }
    return map;
  }

  /**
   * Loads properties from a file and maps food items to their corresponding cookers.
   * The properties file should contain keys representing food items
   * and values representing cooker class names.
   *
   * @param url the file path of the properties file
   * @return a HashMap containing food item names as keys and  Cooker instances as values
   */
  public static HashMap<String, CookAbility> getFoodToCookerMap(String url) {
    HashMap<String, CookAbility> map = new HashMap<String, CookAbility>();
    Properties p = new Properties();
    try (InputStream input = Files.newInputStream(Paths.get(url))) {
      p.load(input);
      Set<Object> keys = p.keySet();
      for (Object key : keys) {
        String className = p.getProperty((String) key);
        CookAbility cooker =
            (CookAbility) Class.forName(className).getMethod("getInstance").invoke(null);
        map.put((String) key, cooker);
      }
    } catch (Exception e) {
      System.out.println("Can't load properties file!");
    }
    return map;
  }

}
