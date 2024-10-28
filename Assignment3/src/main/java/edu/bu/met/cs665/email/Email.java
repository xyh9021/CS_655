/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: Email.java
 * Description: This abstract class represents the structure of an email,
 * including customer details, title, and body. It provides functionality
 * for sending and displaying emails.
 */

package edu.bu.met.cs665.email;

/**
 * This is Abstract class Email.
 * This class defines the basic structure and behavior of an email,
 * including the email's title, body, and recipient information.
 */
public abstract class Email {

  // The type of customer
  private String customerType;
  // The name of the customer.
  private String customerName;
  // The email address of the customer.
  private String customerEmailAddress;
  // The title or subject of the email.
  private String title;
  // The main content or body of the email.
  private String body;

  /**
   * Sends the email to the customer.
   *
   * @return a string indicating the customer type, name, and email address.
   */
  public String send() {
    return "Send email to " + customerType + " " + customerName + " " + customerEmailAddress;
  }

  /**
   * Displays the email's title and body.
   *
   * @return a string containing the email's title and body content.
   */
  public String show() {
    return "title: " + title + "\nbody: " + body;
  }

  /**
   * Gets the type of the customer.
   *
   * @return the type of customer (e.g., Business, VIP).
   */
  public String getCustomerType() {
    return customerType;
  }

  /**
   * Sets the type of the customer.
   *
   * @param customerType the type of the customer to set.
   */
  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

  /**
   * Gets the customer's name.
   *
   * @return the name of the customer.
   */
  public String getCustomerName() {
    return customerName;
  }

  /**
   * Sets the customer's name.
   *
   * @param customerName the name of the customer to set.
   */
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  /**
   * Gets the customer's email address.
   *
   * @return the email address of the customer.
   */
  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }

  /**
   * Sets the customer's email address.
   *
   * @param customerEmailAddress the email address to set.
   */
  public void setCustomerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
  }

  /**
   * Gets the email's title or subject.
   *
   * @return the title of the email.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the email's title or subject.
   *
   * @param title the title to set.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Gets the email's body content.
   *
   * @return the body of the email.
   */
  public String getBody() {
    return body;
  }

  /**
   * Sets the email's body content.
   *
   * @param body the content to set as the email body.
   */
  public void setBody(String body) {
    this.body = body;
  }
}
