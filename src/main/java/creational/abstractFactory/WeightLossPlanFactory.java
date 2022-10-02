package creational.abstractFactory;

public class WeightLossPlanFactory implements PlanFactory {
    @Override
    public MealPlan createMealPlan() {
        return new WeighLossMealPlan();
    }

    @Override
    public WorkoutPlan creteWorkout() {
        return new WeightLossWorkout();
    }
}
