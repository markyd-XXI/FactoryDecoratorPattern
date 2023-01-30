package main.java;

/**
 * PlanFactory gets delegated the choosing of the proper feature factory to instantiate
 */
public class PlanFactory {
    private PlanFeatureFactory planFeatureFactory;

    /**
     * Here the feature factories are delegated the responsibility of defining what features make a plan by
     * decorating the respective plans with those features and returning them to this factory.
     */
    Plan getPlan(PlansEnum planName){

        if(planName == PlansEnum.THECHEAPO){
            planFeatureFactory = new CheapoFeatureFactory(new CheapoPlan());
        }

        if(planName == PlansEnum.THEBASICS){
            planFeatureFactory = new BasicsFeatureFactory(new BasicsPlan());
        }

        if(planName == PlansEnum.THEBALLER){
            planFeatureFactory = new BallerFeatureFactory(new BallerPlan());
        }

        return planFeatureFactory.buildPlan();
    }
}
