/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: EmailGenerator.java
 * Description: This class represents an Email Generator that generates personalized emails based on the customer segment.
 */

 package edu.bu.met.cs665.example1;

 import edu.bu.met.cs665.example1.customers.CustomerSegment;
 
 public class EmailGenerator {
 
     /**
      * The customer segment for which the email is generated.
      */
     private CustomerSegment customerSegment;
 
     /**
      * Constructor to create an EmailGenerator instance with a specific customer segment.
      *
      * @param customerSegment The customer segment for which the email will be generated.
      */
     public EmailGenerator(CustomerSegment customerSegment) {
         this.customerSegment = customerSegment;
     }
 
     /**
      * Set the customer segment for the EmailGenerator.
      *
      * @param customerSegment The new customer segment.
      */
     public void setCustomerSegment(CustomerSegment customerSegment) {
         this.customerSegment = customerSegment;
     }
 
     /**
      * Generate an email based on the current customer segment.
      *
      * @return A string representing the generated email.
      */
     public String generateEmail() {
         return customerSegment.generateEmail();
     }
 }
 