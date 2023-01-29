package main.java;

public class CellPhoneStore {
    public Plan buildPlan(PlansEnum planName){
        PlanFactory planFactory = new PlanFactory();
        return planFactory.getPlan(planName);
    }
}
