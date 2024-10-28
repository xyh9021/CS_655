/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: ReturningEmailFactory.java
 * Description: This class is a factory for creating ReturningEmail objects.
 * It implements the Factory interface and provides a concrete method
 * to generate emails for returning customers.
 */

package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.email.ReturningEmail;

/**
 * This is ReturningEmailFactory class.
 * This class implements the Factory interface to create ReturningEmail objects.
 * It encapsulates the logic required to generate an email specifically for returning customers.
 */
public class ReturningEmailFactory implements Factory {

  /**
   * Generates a ReturningEmail object based on the provided name and email address.
   *
   * @param name  the name of the returning customer
   * @param email the email address of the returning customer
   * @return a new instance of ReturningEmail customized for the returning customer
   */
  @Override
  public Email generateEmail(String name, String email) {
    return new ReturningEmail(name, email);
  }
}
