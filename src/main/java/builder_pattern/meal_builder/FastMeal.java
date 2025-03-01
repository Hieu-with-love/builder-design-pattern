package builder_pattern.meal_builder;

public class FastMeal {
    private String burger;
    private String drink;
    private boolean hasFries;
    private boolean hasSpecialSauce;

    // Constructor riêng chỉ cho phép Builder sử dụng
    private FastMeal(MealBuilder builder) {
        this.burger = builder.burger;
        this.drink = builder.drink;
        this.hasFries = builder.hasFries;
        this.hasSpecialSauce = builder.hasSpecialSauce;
    }

    public void showMeal() {
        System.out.println("Món ăn gồm: ");
        System.out.println("- Burger: " + (burger != null ? burger : "Không có"));
        System.out.println("- Nước uống: " + (drink != null ? drink : "Không có"));
        System.out.println("- Khoai tây chiên: " + (hasFries ? "Có" : "Không"));
        System.out.println("- Sốt đặc biệt: " + (hasSpecialSauce ? "Có" : "Không"));
    }

    // Inner static Builder class
    public static class MealBuilder {
        private String burger;
        private String drink;
        private boolean hasFries;
        private boolean hasSpecialSauce;

        public MealBuilder makeBurger(String burger) {
            this.burger = burger;
            return this;
        }

        public MealBuilder makeDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public MealBuilder addFries() {
            this.hasFries = true;
            return this;
        }

        public MealBuilder addSpecialSauce() {
            this.hasSpecialSauce = true;
            return this;
        }

        public FastMeal build() {
            return new FastMeal(this);
        }
    }
}
