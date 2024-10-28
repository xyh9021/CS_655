/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: FrequentEmail.java
 * Description: This class represents an email for frequent customers.
 * It extends the abstract Email class and initializes the email
 * with specific customer details, including name, email, title, and body.
 */

package edu.bu.met.cs665.email;

/**
 * This is FrequentEmail class.
 * This class is responsible for generating emails tailored for frequent customers.
 * It sets the customer type to "Frequent" and initializes the email's title and content.
 */
public class FrequentEmail extends Email {

  /**
   * Constructor for FrequentEmail.
   * Initializes the email with the customer's name and email address.
   * Sets the customer type to "Frequent" and customizes the email's title.
   *
   * @param name  the name of the frequent customer
   * @param email the email address of the frequent customer
   */
  public FrequentEmail(String name, String email) {
    this.setCustomerType("Frequent");
    this.setCustomerName(name);
    this.setCustomerEmailAddress(email);
    this.setTitle("Dear frequent customer: " + this.getCustomerName());
    this.setBody("");
  }
}
