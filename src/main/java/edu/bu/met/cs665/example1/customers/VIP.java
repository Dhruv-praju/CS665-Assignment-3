package edu.bu.met.cs665.example1.customers;

public class VIP implements CustomerSegment {
    String name;

    public VIP(String name){
        this.name = name;
    }
    @Override
    public String generateEmail() {
        // TODO Auto-generated method stub
        return "Subject: Exclusive VIP Offer Just for You\n\n" +
        "Dear " + name + ",\n" +
        "As a VIP customer, you are entitled to exclusive benefits. Enjoy a VIP-only discount on our premium products and services.\n" +
        "Thank you for being a VIP customer .\n\n" +
        "Best regards\n\n";
    }
}
