/**
 * Name: Yuheng Xia
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: VIPEmailFactory.java
 * Description: This class is a factory for creating VIPEmail objects.
 * It implements the Factory interface and provides a concrete method
 * to generate emails for VIP customers.
 */

package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.email.VipEmail;

/**
 * This is VIPEmailFactory class.
 * This class implements the Factory interface to create VIPEmail objects.
 * It encapsulates the logic required to generate an email specifically for VIP customers.
 */
public class VipEmailFactory implements Factory {

  /**
   * Generates a VIPEmail object based on the provided name and email address.
   *
   * @param name  the name of the VIP customer
   * @param email the email address of the VIP customer
   * @return a new instance of VIPEmail customized for the VIP customer
   */
  @Override
  public Email generateEmail(String name, String email) {
    return new VipEmail(name, email);
  }
}
