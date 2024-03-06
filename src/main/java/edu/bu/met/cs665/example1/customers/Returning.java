package edu.bu.met.cs665.example1.customers;

public class Returning implements CustomerSegment{
    String name;

    public Returning(String name){
        this.name = name;
    }
    @Override
    public String generateEmail() {
        // TODO Auto-generated method stub
        return "Subject: Welcome Back, " + name + "! Special Offer Inside\n\n" +
                "Dear " + name + ",\n" +
                "Welcome back to ! We're thrilled to have you as our returning customer. To express our gratitude, here's a special discount on your next purchase.\n" +
                "Thank you for your loyalty. We look forward to serving you again.\n\n" +
                "Best regards\n\n" ;
    }
}
