package main.java;

public class Main {
    public static void main(String[] args)
    {
        //Factory Pattern demonstrated by the PlanFactory
        System.out.println("this is the FactoryDecorator Pattern assignment");
        CellPhoneStore cellPhoneStore = new CellPhoneStore();
        System.out.println("Bob visits the cell phone store!");
        System.out.printf("Bob wants the plan: %s", PlansEnum.THECHEAPO.name());
        System.out.println();
        Plan plan = cellPhoneStore.buildPlan(PlansEnum.THECHEAPO);
        System.out.printf("The base price for %s is %s", plan.getDescription(), plan.getPrice());
        System.out.println();
        plan = new ExtraData(plan);
        plan = new UnlimitedText(plan);
        System.out.printf("Customer Monthly Price: \n Plan: %s \n $%.2f", plan.getDescription(), plan.getPrice());
        System.out.println();
    }
}
