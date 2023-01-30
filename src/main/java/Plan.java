package main.java;

public abstract class Plan {
    protected String name = "";
    protected String description = "Mobile plan with: ";
    protected double price = 29.99;

    public double getPrice() {
        return price;
    }

    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }
}
