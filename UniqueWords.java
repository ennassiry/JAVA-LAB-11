package TPO1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
    	
    	// partie 1
        String text = "chat chien chat souris oiseau chien";
        String[] wordsArray = text.split(" ");
        
        Set<String> uniqueWords = new HashSet<>();
        for (String w : wordsArray) {
            uniqueWords.add(w);
        }
        
        System.out.println("Mots uniques : " + uniqueWords);
        
     // partie 2
        
        Set<String> hashSet = new HashSet<>(Arrays.asList("Zèbre", "Ananas", "Banane"));
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("Zèbre", "Ananas", "Banane"));
        Set<String> treeSet = new TreeSet<>(Arrays.asList("Zèbre", "Ananas", "Banane"));
        
        System.out.println("HashSet (non ordonné) : " + hashSet);
        System.out.println("LinkedHashSet (ordre d'insertion) : " + linkedHashSet);
        System.out.println("TreeSet (trié alphabétiquement) : " + treeSet);
        
    }
}
