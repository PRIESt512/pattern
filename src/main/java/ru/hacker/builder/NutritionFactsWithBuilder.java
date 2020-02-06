package ru.hacker.builder;

public class NutritionFactsWithBuilder {

    private int servingSize; //(мл в порции) Необходим
    private int servings;  //(количество порций) Необходим
    private int calories; //(калорий в порции) Необязателен
    private int fat; //(жиров в порции) Необязателен
    private int sodium; //(Na в порции) Необязателен
    private int carbohydrate;  //(углеводы в порции) Необязателен

    private NutritionFactsWithBuilder(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static class Builder {
        // Необходимые параметры
        private final int servingSize;
        private final int servings;

        // Необязательные параметры — инициализированы
        // значениями по умолчанию
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFactsWithBuilder build() {
            return new NutritionFactsWithBuilder(this);
        }
    }
}
