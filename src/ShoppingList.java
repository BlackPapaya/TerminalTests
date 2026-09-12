import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> einkaufsliste = new ArrayList<>();


        einkaufsliste.add(" Milch ");
        einkaufsliste.add(" Brot ");
        einkaufsliste.add(" Eier ");

        System.out.println("Erstes Element: " + einkaufsliste.get(0));

        einkaufsliste.set(1, "Vollkornbrot");

        einkaufsliste.remove(" Eier "); // Funktioniert jetzt sauber!

        System.out.println("Anzahl Elemente: " + einkaufsliste.size());

        try {
            System.out.println("Was willst du noch hinzufügen:");
            String baum = scanner.nextLine();

            if (baum.matches("\\d+")) {
                throw new InputMismatchException();
            }

            einkaufsliste.add(baum);
            System.out.println("Einkaufsliste lautet: " + einkaufsliste);

        } catch (InputMismatchException e) {
            System.out.println("Keine reinen Zahlen eingeben!");
        }

        scanner.close();
    }
}