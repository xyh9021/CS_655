/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: BusinessEmailFactory.java
 * Description: This class is a factory for creating BusinessEmail objects.
 * It implements the Factory interface and provides a concrete method
 * to generate emails for business customers.
 */

package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.email.BusinessEmail;
import edu.bu.met.cs665.email.Email;

/**
 * This is BusinessEmailFactory class.
 * This class implements the Factory interface to create BusinessEmail objects.
 * It encapsulates the logic required to generate an email specifically for business customers.
 */
public class BusinessEmailFactory implements Factory {

  /**
   * Generates a BusinessEmail object based on the provided name and email address.
   *
   * @param name  the name of the business customer
   * @param email the email address of the business customer
   * @return a new instance of BusinessEmail customized for the business customer
   */
  @Override
  public Email generateEmail(String name, String email) {
    return new BusinessEmail(name, email);
  }
}
