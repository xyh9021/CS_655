package edu.bu.met.cs665;

import edu.bu.met.cs665.cooker.BeverageCooker;
import edu.bu.met.cs665.food.Food;
import edu.bu.met.cs665.food.beverage.coffee.Espresso;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestAge {

  public TestAge() {
  }


  @Test
  public void testGetDescription() {
    Espresso espresso = new Espresso();
    assertEquals("Espresso with 0 milk unit and 0 sugar unit.", espresso.getDescription());
    espresso.setMilkUnit(2);
    espresso.setSugarUnit(1);
    assertEquals("Espresso with 2 milk unit and 1 sugar unit.", espresso.getDescription());
  }

  @Test
  public void testGetPrice() {
    Espresso espresso = new Espresso();
    assertEquals(3.0, espresso.getPrice(), 0.01);

    espresso.setMilkUnit(1);
    assertEquals(3.5, espresso.getPrice(), 0.01);

    espresso.setSugarUnit(2);
    assertEquals(4.5, espresso.getPrice(), 0.01);
  }

  @Test
  public void testSetUnit() {
    Espresso espresso = new Espresso();
    //Test setMilkUnit
    espresso.setMilkUnit(2);
    assertEquals("Espresso with 2 milk unit and 0 sugar unit.", espresso.getDescription());
    espresso.setMilkUnit(-1);
    assertEquals("Espresso with 2 milk unit and 0 sugar unit.", espresso.getDescription());
    espresso.setMilkUnit(4);
    assertEquals("Espresso with 2 milk unit and 0 sugar unit.", espresso.getDescription());

    //Test setSugarUnit
    espresso.setSugarUnit(3);
    assertEquals("Espresso with 2 milk unit and 3 sugar unit.", espresso.getDescription());
    espresso.setSugarUnit(-1);
    assertEquals("Espresso with 2 milk unit and 3 sugar unit.", espresso.getDescription());
    espresso.setSugarUnit(4);
    assertEquals("Espresso with 2 milk unit and 3 sugar unit.", espresso.getDescription());
  }

  @Test
  public void testCookValidBeverage() {
    BeverageCooker beverageCooker = BeverageCooker.getInstance();
    beverageCooker.setTestMode(true);
    Food beverage = beverageCooker.cook("espresso");
    assertTrue("The cooked beverage should be an instance of Espresso.", beverage instanceof Espresso);
  }

  @Test
  public void testCookInvalidBeverage() {
    //test spell error
    BeverageCooker beverageCooker = BeverageCooker.getInstance();
    beverageCooker.setTestMode(true);
    Food beverage = beverageCooker.cook("milk");
    assertNull(beverage);
  }

  @Test
  public void testOrderValidFood() {
    VendingMachine vendingMachine = new VendingMachine();
    vendingMachine.setTestMode(true);
    Food food = vendingMachine.order("espresso");
    assertTrue("The cooked food should be an instance of Espresso.", food instanceof Espresso);
  }

  @Test
  public void testOrderInvalidFood() {
    VendingMachine vendingMachine = new VendingMachine();
    vendingMachine.setTestMode(true);
    Food food = vendingMachine.order("pizza");
    assertNull(food);
  }

}