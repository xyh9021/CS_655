/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: VIPEmail.java
 * Description: This class represents an email for VIP customers.
 * It extends the abstract Email class and initializes the email
 * with specific customer details, such as name, email, title, and body.
 */

package edu.bu.met.cs665.email;

/**
 * This is VIPEmail class.
 * This class is responsible for generating emails tailored for VIP customers.
 * It sets the customer type to "VIP" and initializes the email's title and content.
 */
public class VipEmail extends Email {
  /**
   * Constructor for VIPEmail.
   * Initializes the email with the customer's name and email address.
   * Sets the customer type to "VIP" and customizes the email's title.
   *
   * @param name  the name of the VIP customer
   * @param email the email address of the VIP customer
   */
  public VipEmail(String name, String email) {
    this.setCustomerType("VIP");
    this.setCustomerName(name);
    this.setCustomerEmailAddress(email);
    this.setTitle("Dear VIP customer: " + this.getCustomerName());
    this.setBody("");
  }
}
