public abstract class Tier {

    private String name;
    private int alter;


    public abstract void machGeraeusch();

    public abstract void gekraultWerden();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Tier(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }
}
