/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: BusinessEmail.java
 * Description: This class represents a business-specific email. It extends
 * the abstract Email class and initializes the email with a business-specific
 * customer type, name, email address, title, and body.
 */

package edu.bu.met.cs665.email;

/**
 * This is BusinessEmail class.
 * This class is responsible for creating an email tailored for business customers.
 * It sets the email's title and initializes the customer details upon creation.
 */
public class BusinessEmail extends Email {

  /**
   * Constructor for BusinessEmail.
   * Initializes the email with the customer's name and email address.
   * Sets the customer type to "Business" and customizes the email's title.
   *
   * @param name  the name of the business customer
   * @param email the email address of the business customer
   */
  public BusinessEmail(String name, String email) {
    this.setCustomerType("Business");
    this.setCustomerName(name);
    this.setCustomerEmailAddress(email);
    this.setTitle("Dear business customer: " + this.getCustomerName());
    this.setBody("");
  }
}
