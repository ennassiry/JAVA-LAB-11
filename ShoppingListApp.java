package TPO1;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
	public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        // partie 1
        shoppingList.add("poissan");
        shoppingList.add("formage");
        shoppingList.add("chocola");
        
        System.out.println("Articles de la liste :");
        for (String item : shoppingList) {
            System.out.println("- " + item);
        }
     // partie 
        shoppingList.remove("poissan");
        boolean hasApples = shoppingList.contains("chocola");
        System.out.println("Contient des chocola ? " + hasApples);
        System.out.println("Taille finale de la liste : " + shoppingList.size());
    }

}
