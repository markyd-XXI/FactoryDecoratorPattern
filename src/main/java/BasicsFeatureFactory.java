package main.java;

public class BasicsFeatureFactory extends PlanFeatureFactory{
    public BasicsFeatureFactory(Plan plan) {
        super(plan);
    }

    @Override
    public Plan buildPlan() {
        plan = new UnlimitedTalk(plan);
        plan = new UnlimitedText(plan);
        return plan;
    }
}
