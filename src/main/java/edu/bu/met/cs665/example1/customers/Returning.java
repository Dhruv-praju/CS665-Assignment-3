/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: Returning.java
 * Description: This class represents a Returning customer segment with methods to generate personalized emails.
 */

 package edu.bu.met.cs665.example1.customers;

 /**
  * The Returning class represents a customer segment for returning customers.
  */
 public class Returning implements CustomerSegment {
 
     /**
      * The name of the returning customer.
      */
     private String name;
 
     /**
      * Constructor to create a Returning instance with a specific name.
      *
      * @param name The name of the returning customer.
      */
     public Returning(String name) {
         this.name = name;
     }
 
     /**
      * Generate an email specific to the Returning customer segment.
      *
      * @return A string representing the generated Returning customer email.
      */
     @Override
     public String generateEmail() {
         return "Subject: Welcome Back, " + name + "! Special Offer Inside\n\n" +
                 "Dear " + name + ",\n" +
                 "Welcome back! We're thrilled to have you as our returning customer. To express our gratitude, here's a special discount on your next purchase.\n" +
                 "Thank you for your loyalty. We look forward to serving you again.\n\n" +
                 "Best regards\n\n";
     }
 }
 