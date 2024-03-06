package edu.bu.met.cs665.example1.customers;

public class Frequent implements CustomerSegment{
    String name;

    public Frequent(String name){
        this.name = name;
    }
    @Override
    public String generateEmail() {
        // TODO Auto-generated method stub
        return "Subject: Thank You for Being a Frequent Shopper, " + name + "!\n\n" +
                "Dear " + name + ",\n" +
                "Thank you for being a frequent shopper. We truly appreciate your continued support. To show our gratitude, enjoy an exclusive reward with your next purchase.\n" +
                "Thank you for choosing us. We value your loyalty.\n\n" +
                "Best regards\n\n";
    }
}
