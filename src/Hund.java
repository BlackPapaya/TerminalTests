public class Hund extends Tier {

    public Hund(String name, int alter) {
        super(name,alter);
    }


    @Override
    public void machGeraeusch() {
        System.out.println("Wuff");
    }

    @Override
    public void gekraultWerden() {
        System.out.println(getName() + " hat dich gebissen");
    }

}


