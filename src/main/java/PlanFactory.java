package main.java;

public class PlanFactory {
    Plan getPlan(PlansEnum planName){
        Plan plan = null;

        if(planName == PlansEnum.THECHEAPO){
            plan = new CheapoPlan();
        }

        if(planName == PlansEnum.THEBASICS){
            plan = new BasicsPlan();
            plan = new UnlimitedText(plan); //Decorator #1
        }

        if(planName == PlansEnum.THEBALLER){
            plan = new BallerPlan();
            plan = new UnlimitedText(plan);
            plan = new ExtraData(plan); //Decorator #2
        }

        return plan;
    }
}
