package ru.hacker.builder;

/**
 * Nutrition Facts этикетка, которая имеется на упакованных пищевых продуктах
 * Nutrition Facts имеет несколько обязательных полей — размер порции, число порций в упаковке, калорийность порции,
 * а также более двадцати необязательных полей — количество жира,
 */
public class NutritionFacts {

    private final int servingSize; //(мл в порции) Необходим
    private final int servings;  //(количество порций)Необходим
    private final int calories; //(калорий в порции) Необязателен
    private final int fat; //(жиров в порции) Необязателен
    private final int sodium; //(Na в порции) Необязателен
    private final int carbohydrate;  //(углеводы в порции)Необязателен


    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings,
                          int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
