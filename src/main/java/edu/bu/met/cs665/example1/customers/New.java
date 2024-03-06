package edu.bu.met.cs665.example1.customers;

public class New implements CustomerSegment {
    String name;
    public New(String name){
        this.name = name;
    }
    @Override
    public String generateEmail() {
        // TODO Auto-generated method stub
        return "Subject: Welcome to Our Community! Special New Customer Offer Inside\n\n" +
        "Dear " + name + ",\n" +
        "Welcome to our community! We're delighted to have you as our newest customer. To kick off your experience, here's a special offer on your first purchase.\n\n" +
        "Thank you for choosing us. We look forward to serving you for years to come.\n\n" +
        "Best regards\n\n";
    }
}
