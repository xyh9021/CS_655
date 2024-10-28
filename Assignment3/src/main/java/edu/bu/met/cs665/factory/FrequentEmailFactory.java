/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: FrequentEmailFactory.java
 * Description: This class is a factory for creating FrequentEmail objects.
 * It implements the Factory interface and provides a concrete method
 * to generate emails for frequent customers.
 */

package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.email.FrequentEmail;

/**
 * This is FrequentEmailFactory class.
 * This class implements the Factory interface to create FrequentEmail objects.
 * It encapsulates the logic required to generate an email specifically for frequent customers.
 */
public class FrequentEmailFactory implements Factory {

  /**
   * Generates a FrequentEmail object based on the provided name and email address.
   *
   * @param name  the name of the frequent customer
   * @param email the email address of the frequent customer
   * @return a new instance of FrequentEmail customized for the frequent customer
   */
  @Override
  public Email generateEmail(String name, String email) {
    return new FrequentEmail(name, email);
  }
}
