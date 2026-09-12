public class Katze extends Tier {

    public Katze(String name, int alter) {
        super(name,alter);
    }

    @Override
    public void machGeraeusch() {
        System.out.println("Meow");
    }

    @Override
    public void gekraultWerden() {
        System.out.println(getName() + " schnurrt ganz laut");
    }

}
