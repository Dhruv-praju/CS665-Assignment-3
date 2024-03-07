/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: New.java
 * Description: This class represents a New customer segment with methods to generate personalized emails.
 */

 package edu.bu.met.cs665.example1.customers;

 /**
  * The New class represents a customer segment for new customers.
  */
 public class New implements CustomerSegment {
 
     /**
      * The name of the new customer.
      */
     private String name;
 
     /**
      * Constructor to create a New instance with a specific name.
      *
      * @param name The name of the new customer.
      */
     public New(String name) {
         this.name = name;
     }
 
     /**
      * Generate an email specific to the New customer segment.
      *
      * @return A string representing the generated New customer email.
      */
     @Override
     public String generateEmail() {
         return "Subject: Welcome to Our Community! Special New Customer Offer Inside\n\n" +
                 "Dear " + name + ",\n" +
                 "Welcome to our community! We're delighted to have you as our newest customer. To kick off your experience, here's a special offer on your first purchase.\n\n" +
                 "Thank you for choosing us. We look forward to serving you for years to come.\n\n" +
                 "Best regards\n\n";
     }
 }
 