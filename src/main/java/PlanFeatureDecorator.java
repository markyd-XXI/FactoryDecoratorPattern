package main.java;

public abstract class PlanFeatureDecorator extends Plan{
    Plan plan;
    protected double price = 0.00;
    protected String description = "";

    public double getPrice() {
        return plan.getPrice() + price;
    }

    public String getDescription() {

        return String.format("%s \n + %s", plan.getDescription(), description);
    }
}
