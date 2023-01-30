package main.java;

public class UnlimitedText extends PlanFeatureDecorator {
    //this is decorator #1
    public UnlimitedText(Plan plan){
        this.plan = plan;
        price = 10.00;
        description = "Unlimited Text";
    }
}
