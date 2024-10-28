/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: EmailCreator.java
 * Description: This class is responsible for generating emails using the appropriate
 * factory. It leverages the Factory design pattern to delegate the creation of specific
 * email objects based on the provided factory.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.factory.Factory;

/**
 * This is EmailCreator class.
 * This class acts as a client for generating emails using the provided factory.
 * It allows dynamic setting of different factories to generate specific types of emails.
 */
public class EmailCreator {
  private Factory factory;

  /**
   * Generates an email using the provided customer name and email address.
   * It delegates the email creation process to the factory.
   *
   * @param name          the name of the customer
   * @param emailAddress  the email address of the customer
   * @return an Email object if the factory is set, otherwise null
   */
  public Email generateEmail(String name, String emailAddress) {
    if (factory == null) {
      return null;
    } else {
      return factory.generateEmail(name, emailAddress);
    }
  }

  /**
   * Sets the factory to be used for generating emails.
   *
   * @param factory the factory to set
   */
  public void setFactory(Factory factory) {
    this.factory = factory;
  }
}
