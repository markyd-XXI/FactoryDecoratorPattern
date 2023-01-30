package main.java;

public abstract class PlanFeatureFactory {
    protected Plan plan;
    public PlanFeatureFactory(Plan plan){
        this.plan = plan;
    }
    public abstract Plan buildPlan();
}
