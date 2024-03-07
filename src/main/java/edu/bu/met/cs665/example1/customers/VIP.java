/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: VIP.java
 * Description: This class represents a VIP customer segment with methods to generate personalized emails.
 */

 package edu.bu.met.cs665.example1.customers;

 /**
  * The VIP class represents a customer segment for VIP customers.
  */
 public class VIP implements CustomerSegment {
 
     /**
      * The name of the VIP customer.
      */
     private String name;
 
     /**
      * Constructor to create a VIP instance with a specific name.
      *
      * @param name The name of the VIP customer.
      */
     public VIP(String name) {
         this.name = name;
     }
 
     /**
      * Generate an email specific to the VIP customer segment.
      *
      * @return A string representing the generated VIP email.
      */
     @Override
     public String generateEmail() {
         return "Subject: Exclusive VIP Offer Just for You\n\n" +
                 "Dear " + name + ",\n" +
                 "As a VIP customer, you are entitled to exclusive benefits. Enjoy a VIP-only discount on our premium products and services.\n" +
                 "Thank you for being a VIP customer.\n\n" +
                 "Best regards\n\n";
     }
 }
 