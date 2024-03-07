package edu.bu.met.cs665;

import org.junit.Test;

import edu.bu.met.cs665.example1.EmailGenerator;
import edu.bu.met.cs665.example1.customers.Business;
import edu.bu.met.cs665.example1.customers.Frequent;
import edu.bu.met.cs665.example1.customers.New;
import edu.bu.met.cs665.example1.customers.VIP;

public class TestEmailGenerator {
    public TestEmailGenerator(){

    }
    @Test
    public void testNewCustomer(){
        New newCustomer = new New("Harry Potter");
        EmailGenerator emailGenerator = new EmailGenerator(newCustomer);

        String email = emailGenerator.generateEmail();

        System.out.println(email);
    }
    @Test
    public void testVIPCustomer(){
        VIP vipCustomer = new VIP("Elon Musk");
        EmailGenerator emailGenerator = new EmailGenerator(vipCustomer);

        String email = emailGenerator.generateEmail();

        System.out.println(email);
    }
    @Test
    public void testBusinesCustomer(){
        Business businessCustomer = new Business("Stark Industries");
        EmailGenerator emailGenerator = new EmailGenerator(businessCustomer);

        String email = emailGenerator.generateEmail();

        System.out.println(email);
    }
    @Test
    public void testFrequentCustomer(){
        Frequent frequentCustomer = new Frequent("Alex Pandian");
        EmailGenerator emailGenerator = new EmailGenerator(frequentCustomer);

        String email = emailGenerator.generateEmail();

        System.out.println(email);    
    }
    @Test
    public void testChangeInCustomerType(){
        VIP vipCustomer = new VIP("Elon Musk");
        EmailGenerator emailGenerator = new EmailGenerator(vipCustomer);
        Business businessCustomer = new Business("Intelli Soft Inc.");

        emailGenerator.setCustomerSegment(businessCustomer);
        String email = emailGenerator.generateEmail();

        System.out.println(email);

    }
}
