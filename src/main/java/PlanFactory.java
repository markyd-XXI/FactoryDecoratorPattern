package main.java;

public class PlanFactory {
    Plan getPlan(PlansEnum planName){
        Plan plan = null;

        if(planName == PlansEnum.THECHEAPO){
            plan = new CheapoPlan();
        }

        if(planName == PlansEnum.THEBASICS){
            plan = new BasicsPlan();
        }

        if(planName == PlansEnum.THEBALLER){
            plan = new BallerPlan();
        }

        return plan;
    }
}
