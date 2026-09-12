import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ZahlenRater {

    public static final Random r = new Random();

    public static void main(String[] args) {

        int ziel = r.nextInt(100);
        Scanner scanner = new Scanner(System.in);

        int rate = -1;


        System.out.println("Errate die Zahl (zwischen 0 und 99): ");

        while (rate != ziel) {
            try {
                rate = scanner.nextInt();

                if (rate == ziel) {
                    System.out.println("Richtig!");
                } else {
                    System.out.println("Falsch, versuche es nochmal:");
                }

            } catch (InputMismatchException e) {
                System.out.println("Das war keine gültige Zahl");
                scanner.next();
            }
        }
        System.out.println("Programm beendet");
        scanner.close();
    }

}

