import java.util.ArrayList;
import java.util.List;

public class TierHeim {



            public static void main(String[] args) {

                List<Tier> insassen = new ArrayList<>();

                insassen.add(new Katze("Mimi", 3));
                insassen.add(new Hund("Luna", 4));

                Tier minka = new Katze("Minka", 3);
                Tier bello = new Hund("Bello", 4);

                System.out.println(minka.getName());
                minka.machGeraeusch();

                System.out.println( bello.getName());
                bello.machGeraeusch();

                for (Tier tier : insassen) {
                    System.out.println("Hier ist: " + tier.getName());
                    tier.machGeraeusch();
                    tier.gekraultWerden();
                    System.out.println("-----------------");

                }

            }
}
