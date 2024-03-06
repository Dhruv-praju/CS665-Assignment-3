package edu.bu.met.cs665;

import org.junit.Test;

import edu.bu.met.cs665.example1.EmailGenerator;
import edu.bu.met.cs665.example1.customers.New;
import edu.bu.met.cs665.example1.customers.VIP;

public class TestEmailGenerator {
    public TestEmailGenerator(){

    }
    @Test
    public void testNewCustomer(){
        New newCustomer = new New("ABC LLP.");
        EmailGenerator emailGenerator = new EmailGenerator(newCustomer);

        System.out.println(emailGenerator.generateEmail());
    }
    @Test
    public void testVIPCustomer(){
        VIP vipCustomer = new VIP("IntelliSoft Inc.");
        EmailGenerator emailGenerator = new EmailGenerator(vipCustomer);

        System.out.println(emailGenerator.generateEmail());
    }
}
