import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    public static Scanner scanner = new Scanner(System.in);
    public static char aktuellerSpieler = 'X';
    public static boolean spielLaeuft = true;
    public static char[][] spielfeld = new char[3][3];

    public static void printBoard(char[][] feld) {
        System.out.println("--------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(feld[i][j] + " | ");
            }
            System.out.println();
            System.out.println("--------------");
        }
    }

    public static boolean hatGewonnen(char s) {
        for (int i = 0; i < 3; i++) {
            if (spielfeld[i][0] == s && spielfeld[i][1] == s && spielfeld[i][2] == s) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (spielfeld[0][i] == s && spielfeld[1][i] == s && spielfeld[2][i] == s) {
                return true;
            }
        }
        if (spielfeld[0][0] == s && spielfeld[1][1] == s && spielfeld[2][2] == s) {
            return true;
        }
        if (spielfeld[0][2] == s && spielfeld[1][1] == s && spielfeld[2][0] == s) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                spielfeld[i][j] = ' ';
            }
        }
        printBoard(spielfeld);

        while (spielLaeuft) {
            try {
                System.out.println("Spieler " + aktuellerSpieler + " ist dran (Zeile und Spalte 0-2): ");
                int i = scanner.nextInt();
                int j = scanner.nextInt();


                if (i < 0 || i > 2 || j < 0 || j > 2) {
                    System.out.println("Ungültige Eingabe! Zahlen müssen zwischen 0 und 2 liegen.");
                    continue;
                }

                if (spielfeld[i][j] == ' ') {
                    spielfeld[i][j] = aktuellerSpieler;
                    printBoard(spielfeld);

                    if (hatGewonnen(aktuellerSpieler)) {
                        System.out.println("Spieler " + aktuellerSpieler + " hat gewonnen!");
                        break;
                    }

                    if (aktuellerSpieler == 'X') {
                        aktuellerSpieler = 'O';
                    } else {
                        aktuellerSpieler = 'X';
                    }

                } else {
                    System.out.println("Feld belegt! Versuche es nochmal: ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Bitte nur Zahlen eingeben!");
                scanner.next();
            }
        }

        scanner.close();
        System.out.println("Programm beendet.");
    }
}