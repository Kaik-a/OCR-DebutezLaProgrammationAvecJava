package sets;

import java.util.*;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> ingredients = new HashSet<>();
		ingredients.add("sugar");
		ingredients.add("chocolate");
		ingredients.add("butter");
		ingredients.add("vanilla");
		
        //TODO Ajoutez un autre ingrédient à l'ensemble
        ingredients.add("Milk");
        //TODO Supprimez la vanille
        ingredients.remove("vanilla");
        //Affiche le résultat de l'ensemble
	    System.out.println("Here is our ingredients list");
        for(String ingredient: ingredients){
            System.out.println(ingredient);
        }
	}

}
