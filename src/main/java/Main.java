package main.java;

public class Main {
    /**
     * Factory Pattern demonstrated by the PlanFactory which is delegated the task of choosing the correct concrete
     * implementation of the Plan class depending on which plan is desired.
     * <p>
     * Withing the factory class the different concrete implementations of the Plan class are decorated by the Concrete implementations
     * of the PlanFeatureDecorator to build the unique features of a cell phone plan. There are two concrete decorators, UnlimitedText
     * and ExtraData.
     */
    public static void main(String[] args)
    {


        CellPhoneStore cellPhoneStore = new CellPhoneStore();
        System.out.println("Bob visits the cell phone store!");
        System.out.printf("Bob wants the plan: %s", PlansEnum.THECHEAPO.name());
        System.out.println();
        Plan bobPlan = cellPhoneStore.buildPlan(PlansEnum.THECHEAPO);
        System.out.printf("%s Features: \n * %s",bobPlan.getName(), bobPlan.getDescription());
        System.out.println();
        System.out.printf("%s Price: %.2f/mo.", bobPlan.getName(), bobPlan.getPrice());
        System.out.println();

        System.out.println();
        System.out.println("Cindy visits the cell phone store!");
        System.out.printf("Cindy wants the plan: %s", PlansEnum.THEBASICS.name());
        System.out.println();
        Plan cindyPlan = cellPhoneStore.buildPlan(PlansEnum.THEBASICS);
        System.out.printf("%s Features: \n * %s",cindyPlan.getName(), cindyPlan.getDescription());
        System.out.println();
        System.out.printf("%s Price: %.2f/mo.", cindyPlan.getName(), cindyPlan.getPrice());
        System.out.println();

        System.out.println();
        System.out.println("Marty visits the cell phone store!");
        System.out.printf("Marty wants the plan: %s", PlansEnum.THEBALLER.name());
        System.out.println();
        Plan martyPlan = cellPhoneStore.buildPlan(PlansEnum.THEBALLER);
        System.out.printf("%s Features: \n * %s",martyPlan.getName(), martyPlan.getDescription());
        System.out.println();
        System.out.printf("%s Price: %.2f/mo.", martyPlan.getName(), martyPlan.getPrice());
        System.out.println();
    }
}
