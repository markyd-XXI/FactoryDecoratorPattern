package main.java;

public class UnlimitedTalk extends PlanFeatureDecorator{
    //This is decorator #3
    public UnlimitedTalk(Plan plan){
        this.plan = plan;
        price = 10.00;
        description = "Unlimited Talk";
    }
}
