package builder_pattern.meal_builder;

public class Client {
    public static void main(String[] args) {
        FastMealDirector director = new FastMealDirector();

        FastMeal customMeal = new FastMeal.MealBuilder()
                .makeBurger("Beef Burger")
                .makeDrink("Pepsi")
                .addFries()
                .build();
        customMeal.showMeal();

        FastMeal.MealBuilder veggieMealBuilder = new FastMeal.MealBuilder();
        FastMeal veggieMeal = director.constructVeggieMeal(veggieMealBuilder);
        veggieMeal.showMeal();

        FastMeal.MealBuilder chickenMealBuilder = new FastMeal.MealBuilder();
        FastMeal chickenMeal = director.constructChickenMeal(chickenMealBuilder);
        chickenMeal.showMeal();
    }
}
