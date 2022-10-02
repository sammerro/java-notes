package creational.abstractFactory;

public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;
    private PlanFactory planFactory;

    public HomePage() {
        planFactory = new MusclePlanFactory();
    }

    public HomePage(Goal goal) {
        setGoal(goal);
    }

    public void setGoal (Goal goal) {
        if (goal == Goal.BUILD_MUSCLE) {
            planFactory = new MusclePlanFactory();
        } else if (goal == Goal.WEIGHT_LOSS) {
            planFactory = new WeightLossPlanFactory();
        }
        recreatePlans();
    }

    public void recreatePlans() {
            workoutPlan = new BuildMuscleWorkout();
            mealPlan = new BuildMuscleMealPlan();
    }
}
