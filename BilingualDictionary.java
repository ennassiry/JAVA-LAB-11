package TPO1;

import java.util.HashMap;
import java.util.Map;
public class BilingualDictionary  {

	public static void main(String[] args) {
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("apple", "pomme");
		dictionary.put("book", "livre");
		dictionary.put("house", "maison");
		dictionary.put("school", "école");
		dictionary.put("water", "eau");
		dictionary.put("computer", "ordinateur");

		System.out.println("--- Dictionnaire complet ---");
		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println("\t"+entry.getKey() + " -> " + entry.getValue());
		}
	}
}
