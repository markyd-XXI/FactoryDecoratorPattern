package main.java;

public class BallerFeatureFactory extends PlanFeatureFactory{
    public BallerFeatureFactory(Plan plan) {
        super(plan);
    }

    @Override
    public Plan buildPlan() {
        plan = new UnlimitedTalk(plan);
        plan = new UnlimitedText(plan);
        plan = new UnlimitedData(plan);
        return plan;
    }
}
