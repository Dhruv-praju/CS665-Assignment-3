/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: CustomerSegment.java
 * Description: This interface defines the contract for customer segments to generate personalized emails.
 */

 package edu.bu.met.cs665.example1.customers;

 /**
  * The CustomerSegment interface provides a contract for implementing different customer segments.
  */
 public interface CustomerSegment {
 
     /**
      * Generate an email specific to the customer segment.
      *
      * @return A string representing the generated email.
      */
     String generateEmail();
 }
 