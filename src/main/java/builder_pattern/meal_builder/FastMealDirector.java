package builder_pattern.meal_builder;

public class FastMealDirector {
    public FastMeal constructVeggieMeal(FastMeal.MealBuilder builder) {
        builder.makeBurger("Veggie Burger")
                .makeDrink("Orange Juice")
                .addFries();
        return builder.build();
    }
    public FastMeal constructChickenMeal(FastMeal.MealBuilder builder) {
        builder.makeBurger("Chicken Burger")
                .makeDrink("Coca Cola")
                .addFries()
                .addSpecialSauce();
        return builder.build();
    }

    public FastMeal constructBeefMeal(FastMeal.MealBuilder builder) {
        builder.makeBurger("Beef Burger")
                .makeDrink("Pepsi")
                .addFries()
                .addSpecialSauce();
        return builder.build();
    }
}
