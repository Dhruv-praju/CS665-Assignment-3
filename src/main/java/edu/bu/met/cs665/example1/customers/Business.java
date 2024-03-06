package edu.bu.met.cs665.example1.customers;

public class Business implements CustomerSegment{
    String name;

    public Business(String name){
        this.name = name;
    }
    @Override
    public String generateEmail() {
        // TODO Auto-generated method stub
        return "Subject: Exclusive Business Offer for " + name + "\n\n" +
                "Dear " + name + " Team,\n" +
                "As a valued business partner of ours, we appreciate your continued collaboration. We're excited to offer " + name + " an exclusive business discount on our latest products.\n" +
                "Thank you for choosing us for your business needs.\n\n" +
                "Best regards\n\n";
    }
}
