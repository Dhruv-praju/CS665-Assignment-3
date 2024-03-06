package edu.bu.met.cs665.example1;

import edu.bu.met.cs665.example1.customers.CustomerSegment;

public class EmailGenerator {
    CustomerSegment customerSegment;

    public EmailGenerator(CustomerSegment customerSegment){
        this.customerSegment = customerSegment;
    }
    
    public void setCustomerSegment(CustomerSegment customerSegment) {
        this.customerSegment = customerSegment;
    }

    public String generateEmail() {
        return customerSegment.generateEmail();
    }

}
