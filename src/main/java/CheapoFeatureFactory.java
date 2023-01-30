package main.java;

public class CheapoFeatureFactory extends PlanFeatureFactory {
    public CheapoFeatureFactory(Plan plan) {
        super(plan);
    }

    @Override
    public Plan buildPlan() {
        plan = new UnlimitedTalk(plan);
        return plan;
    }
}
