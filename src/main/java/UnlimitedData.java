package main.java;

public class UnlimitedData extends PlanFeatureDecorator {
    //This is decorator #2
    public UnlimitedData(Plan plan){
        this.plan = plan;
        price = 10.00;
        description = "Unlimited Data";
    }
}
