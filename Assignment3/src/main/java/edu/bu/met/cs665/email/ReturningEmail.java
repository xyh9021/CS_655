/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: ReturningEmail.java
 * Description: This class represents an email for returning customers.
 * It extends the abstract Email class and initializes the email
 * with specific customer details, such as name, email, title, and body.
 */

package edu.bu.met.cs665.email;

/**
 * This is ReturningEmail class.
 * This class is responsible for generating emails tailored for returning customers.
 * It sets the customer type to "Returning" and initializes the email's title and content.
 */
public class ReturningEmail extends Email {
  /**
   * Constructor for ReturningEmail.
   * Initializes the email with the customer's name and email address.
   * Sets the customer type to "Returning" and customizes the email's title.
   *
   * @param name  the name of the returning customer
   * @param email the email address of the returning customer
   */
  public ReturningEmail(String name, String email) {
    this.setCustomerType("Returning");
    this.setCustomerName(name);
    this.setCustomerEmailAddress(email);
    this.setTitle("Dear returning customer: " + this.getCustomerName());
    this.setBody("");
  }
}
