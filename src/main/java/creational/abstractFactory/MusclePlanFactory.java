package creational.abstractFactory;

public class MusclePlanFactory implements PlanFactory {
    @Override
    public MealPlan createMealPlan() {
        return new BuildMuscleMealPlan();
    }

    @Override
    public WorkoutPlan creteWorkout() {
        return new BuildMuscleWorkout();
    }
}
