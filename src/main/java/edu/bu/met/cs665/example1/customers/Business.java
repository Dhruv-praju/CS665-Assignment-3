/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: Business.java
 * Description: This class represents a Business customer segment with methods to generate personalized emails.
 */

 package edu.bu.met.cs665.example1.customers;

 /**
  * The Business class represents a customer segment for Business customers.
  */
 public class Business implements CustomerSegment {
 
     /**
      * The name of the business customer.
      */
     private String name;
 
     /**
      * Constructor to create a Business instance with a specific name.
      *
      * @param name The name of the business customer.
      */
     public Business(String name) {
         this.name = name;
     }
 
     /**
      * Generate an email specific to the Business customer segment.
      *
      * @return A string representing the generated Business email.
      */
     @Override
     public String generateEmail() {
         return "Subject: Exclusive Business Offer for " + name + "\n\n" +
                 "Dear " + name + " Team,\n" +
                 "As a valued business partner of ours, we appreciate your continued collaboration. We're excited to offer " + name + " an exclusive business discount on our latest products.\n" +
                 "Thank you for choosing us for your business needs.\n\n" +
                 "Best regards\n\n";
     }
 }
 