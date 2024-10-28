/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: NewEmail.java
 * Description: This class represents an email for new customers.
 * It extends the abstract Email class and initializes the email
 * with specific customer details, such as name, email, title, and body.
 */

package edu.bu.met.cs665.email;

/**
 * This is NewEmail class.
 * This class is responsible for generating emails tailored for new customers.
 * It sets the customer type to "New" and initializes the email's title and content.
 */
public class NewEmail extends Email {

  /**
   * Constructor for NewEmail.
   * Initializes the email with the customer's name and email address.
   * Sets the customer type to "New" and customizes the email's title.
   *
   * @param name  the name of the new customer
   * @param email the email address of the new customer
   */
  public NewEmail(String name, String email) {
    this.setCustomerType("New");
    this.setCustomerName(name);
    this.setCustomerEmailAddress(email);
    this.setTitle("Dear new customer: " + this.getCustomerName());
    this.setBody("");
  }
}
