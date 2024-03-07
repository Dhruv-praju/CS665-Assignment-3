/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: Frequent.java
 * Description: This class represents a Frequent customer segment with methods to generate personalized emails.
 */

 package edu.bu.met.cs665.example1.customers;

 /**
  * The Frequent class represents a customer segment for Frequent shoppers.
  */
 public class Frequent implements CustomerSegment {
 
     /**
      * The name of the frequent customer.
      */
     private String name;
 
     /**
      * Constructor to create a Frequent instance with a specific name.
      *
      * @param name The name of the frequent customer.
      */
     public Frequent(String name) {
         this.name = name;
     }
 
     /**
      * Generate an email specific to the Frequent customer segment.
      *
      * @return A string representing the generated Frequent customer email.
      */
     @Override
     public String generateEmail() {
         return "Subject: Thank You for Being a Frequent Shopper, " + name + "!\n\n" +
                 "Dear " + name + ",\n" +
                 "Thank you for being a frequent shopper. We truly appreciate your continued support. To show our gratitude, enjoy an exclusive reward with your next purchase.\n" +
                 "Thank you for choosing us. We value your loyalty.\n\n" +
                 "Best regards\n\n";
     }
 }
 