package main.java;

public class ExtraData extends PlanFeatureDecorator {
    public ExtraData(Plan plan){
        this.plan = plan;
        price = 15.00;
        description = "50 GB extra data";
    }
}
