package generics;

interface MealPlan {
    void showMeal();
}

class VegetarianMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegetarian Meal: Grilled Paneer with Veggies");
    }
}

class VeganMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegan Meal: Tofu Stir Fry with Quinoa");
    }
}

class KetoMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Keto Meal: Chicken with Avocado Salad");
    }
}

class Meal<T extends MealPlan> {
    T plan;

    public Meal(T plan) {
        this.plan = plan;
    }

    public void displayMeal() {
        plan.showMeal();
    }
}

class MealPlanner {
    public static <T extends MealPlan> void generateMealPlan(T plan) {
        System.out.print("Generating your meal plan: ");
        plan.showMeal();
    }
}
