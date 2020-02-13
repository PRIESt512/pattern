package ru.hacker.builder;

public class Demo {

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        NutritionFacts nutritionFacts = new NutritionFacts(a, 4, 3);
        
        NutritionFactsWithBuilder nutritionFactsWithBuilder =
                new NutritionFactsWithBuilder.Builder(5,4)
                .calories(5)
                .sodium(b)
                .build();

    }
}
