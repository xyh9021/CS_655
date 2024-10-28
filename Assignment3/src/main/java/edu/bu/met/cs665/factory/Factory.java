/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: Factory.java
 * Description: This interface defines a factory for generating different types of emails.
 * It declares a method to create an email object based on the provided customer details.
 */

package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.email.Email;

/**
 * This is Factory interface.
 * This interface defines the contract for creating email objects.
 * Classes implementing this interface should provide concrete implementations
 * to generate different types of emails.
 */
public interface Factory {

  /**
   * Generates an email object based on the given customer name and email address.
   *
   * @param name  the name of the customer
   * @param email the email address of the customer
   * @return an Email object specific to the customer type
   */
  public Email generateEmail(String name, String email);
}
