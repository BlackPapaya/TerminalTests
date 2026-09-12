import java.util.InputMismatchException;
import java.util.Scanner;

public class TaschenRechner {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("Wähle eine Zahl:");
                double z1 = scanner.nextDouble();

                System.out.println("Wähle eine zweite Zahl: ");
                double z2 = scanner.nextDouble();

                System.out.println("Wähle Operation aus: 1 (+), 2 (-), 3 (*), 4 (/)");
                int i = scanner.nextInt();

                if (i < 1 || i > 4) {
                    System.out.println("Bitte nur eine Zahl von 1 bis 4 wählen!\n");
                    continue;
                }

                if (i == 4 && z2 == 0) {
                    System.out.println("Fehler: Division durch 0 ist nicht erlaubt!\n");
                    continue;
                }

                double operation[] = {z1 + z2, z1 - z2, z1 * z2, z1 / z2};

                System.out.println("Ergebnis lautet: " + operation[i - 1]);
                break;
            } catch (InputMismatchException e) {
                System.err.println("Ungültige Eingabe! Nur Zahlen bitte.");
                scanner.next();
            }


        }

        scanner.close();
    }
}