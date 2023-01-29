package main.java;

public class UnlimitedText extends PlanFeatureDecorator {
    public UnlimitedText(Plan plan){
        this.plan = plan;
        price = 5.00;
        description = "Unlimited Texting";
    }
}
