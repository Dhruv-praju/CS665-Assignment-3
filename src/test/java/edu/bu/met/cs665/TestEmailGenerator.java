/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: TestEmailGenerator.java
 * Description: This class contains JUnit tests for the EmailGenerator class with different customer types.
 */

 package edu.bu.met.cs665;

 import org.junit.Test;
 
 import edu.bu.met.cs665.example1.EmailGenerator;
 import edu.bu.met.cs665.example1.customers.Business;
 import edu.bu.met.cs665.example1.customers.Frequent;
 import edu.bu.met.cs665.example1.customers.New;
 import edu.bu.met.cs665.example1.customers.Returning;
 import edu.bu.met.cs665.example1.customers.VIP;
 
 /**
  * The TestEmailGenerator class contains JUnit tests for the EmailGenerator class with different customer types.
  */
 public class TestEmailGenerator {
 
     /**
      * Test for generating an email for a new customer.
      */
     @Test
     public void testNewCustomer() {
         New newCustomer = new New("Harry Potter");
         EmailGenerator emailGenerator = new EmailGenerator(newCustomer);
 
         String email = emailGenerator.generateEmail();
 
         System.out.println(email);
     }
 
     /**
      * Test for generating an email for a VIP customer.
      */
     @Test
     public void testVIPCustomer() {
         VIP vipCustomer = new VIP("Elon Musk");
         EmailGenerator emailGenerator = new EmailGenerator(vipCustomer);
 
         String email = emailGenerator.generateEmail();
 
         System.out.println(email);
     }
 
     /**
      * Test for generating an email for a business customer.
      */
     @Test
     public void testBusinessCustomer() {
         Business businessCustomer = new Business("Stark Industries");
         EmailGenerator emailGenerator = new EmailGenerator(businessCustomer);
 
         String email = emailGenerator.generateEmail();
 
         System.out.println(email);
     }
 
     /**
      * Test for generating an email for a returning customer.
      */
     @Test
     public void testReturningCustomer() {
         Returning returningCustomer = new Returning("John Snow");
         EmailGenerator emailGenerator = new EmailGenerator(returningCustomer);
 
         String email = emailGenerator.generateEmail();
 
         System.out.println(email);
     }
 
     /**
      * Test for generating an email for a frequent customer.
      */
     @Test
     public void testFrequentCustomer() {
         Frequent frequentCustomer = new Frequent("Alex Pandian");
         EmailGenerator emailGenerator = new EmailGenerator(frequentCustomer);
 
         String email = emailGenerator.generateEmail();
 
         System.out.println(email);
     }
 
     /**
      * Test for changing the customer type and generating a new email.
      */
     @Test
     public void testChangeInCustomerType() {
         VIP vipCustomer = new VIP("Elon Musk");
         EmailGenerator emailGenerator = new EmailGenerator(vipCustomer);
         Business businessCustomer = new Business("Intelli Soft Inc.");
 
         emailGenerator.setCustomerSegment(businessCustomer);
         String email = emailGenerator.generateEmail();
 
         System.out.println(email);
     }
 }
 