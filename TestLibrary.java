package TPO1;

public class TestLibrary {

    public static void main(String[] args) {

       
        Library library = new Library();

        
        Book b1 = new Book("978-001", "Java POO", "Ahmed");
        Book b2 = new Book("978-002", "Python", "Mohamed");
        Book b3 = new Book("978-003", "Bases de données", "Sara");
        Book b4 = new Book("978-004", "Algorithmique", "Youssef");

        
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("===== LISTE DES LIVRES =====");
        for (Book b : library.getBooks()) {
            System.out.println(b);
        }

     
        library.addCategory("Informatique");
        library.addCategory("Programmation");
        library.addCategory("Bases de données");
        library.addCategory("Programmation");

        System.out.println("\n===== CATÉGORIES =====");
       
        library.addBookIndexed(b4);

        System.out.println("\n===== RECHERCHE PAR ISBN =====");

        Book result = library.findByIsbn("978-002");

        if (result != null) {
            System.out.println("Livre trouvé : " + result);
        } else {
            System.out.println("Livre introuvable !");
        }

        System.out.println("\nRecherche ISBN 999-999 : ");
        System.out.println(library.findByIsbn("999-999"));

        System.out.println("\n===== EMPRUNT DES LIVRES =====");

        System.out.println("Emprunt par Ali : "
                + library.borrowBook(b1, "Ali"));

        System.out.println("Emprunt par Sara : "
                + library.borrowBook(b1, "Sara"));

        System.out.println("Emprunt par Youssef : "
                + library.borrowBook(b2, "Youssef"));

        System.out.println("\n===== RETOUR DES LIVRES =====");

        library.returnBook(b1);

        System.out.println("Nouvel emprunt par Sara : "
                + library.borrowBook(b1, "Sara"));

    }
}