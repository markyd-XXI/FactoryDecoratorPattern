package main.java;

public abstract class Plan {
    protected String description = "";
    protected double price = 0.00;

    public double getPrice() {
        return price;
    }

    public String getDescription(){
        return description;
    }
}
