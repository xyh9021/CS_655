/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: NewEmailFactory.java
 * Description: This class is a factory for creating NewEmail objects.
 * It implements the Factory interface and provides a concrete method
 * to generate emails for new customers.
 */

package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.email.NewEmail;

/**
 * This is NewEmailFactory class.
 * This class implements the Factory interface to create NewEmail objects.
 * It encapsulates the logic required to generate an email specifically for new customers.
 */
public class NewEmailFactory implements Factory {

  /**
   * Generates a NewEmail object based on the provided name and email address.
   *
   * @param name  the name of the new customer
   * @param email the email address of the new customer
   * @return a new instance of NewEmail customized for the new customer
   */
  @Override
  public Email generateEmail(String name, String email) {
    return new NewEmail(name, email);
  }
}
