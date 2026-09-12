import java.util.Random;

public class BooleanAnteil {

        public static final Random r = new Random();
        public static void main(String[] args) {

            int wahr = 0;
            int falsche = 0;
            for (int i = 0; i < 100; i++) {

                boolean wert = r.nextBoolean();
                System.out.println(wert);

                if (wert) {
                    wahr ++;

                } else  {
                    falsche ++;
                }
            }

            double prozent = ((double)wahr / 100) * 100;
            System.out.println("Prozentuale Anteil von true beträgt: " + prozent + " %");

        }
}
