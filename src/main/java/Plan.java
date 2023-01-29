package main.java;

public abstract class Plan {
    protected String name = "";
    protected String description = "No Additional Features";
    protected double price = 0.00;

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
