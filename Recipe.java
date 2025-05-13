This is the class that defines the structure of a recipe.
import java.util.List;

public class Recipe {
    String name;
    List<String> ingredients;
    String steps;
    int cookingTime; // in minutes

    public Recipe(String name, List<String> ingredients, String steps, int cookingTime) {
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
        this.cookingTime = cookingTime;
    }

    public void displayRecipe() {
        System.out.println("\nRecipe Name: " + name);
        System.out.println("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Cooking Time: " + cookingTime + " minutes");
        System.out.println("Steps: " + steps);
    }
}

