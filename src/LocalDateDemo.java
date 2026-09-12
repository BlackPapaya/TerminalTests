import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

   static void printDates(LocalDate start, int days, int n) {

       LocalDate current = start;
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        for(int i = 0; i < n; i++) {
          String formattedDate = current.format(formatter);
          System.out.println(formattedDate);
          current = current.minusDays(days);
        }
    }

    public static void main(String[] args) {

        printDates(LocalDate.of(2022,4, 8),7, 3);

    }

}
