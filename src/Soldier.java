/**
 * Created by jennilynhowell on 7/24/17.
 */
public abstract class Soldier {

    protected String name;
    protected String branch;
    protected String rank;
    protected int serialNumber;
    protected int steps = 0;
    protected boolean awake = true;
    protected boolean hungry = false;

    protected abstract void speak();

    protected void walk() {
        this.steps += 1;
        System.out.println("Walking");
    }
    protected void sleep() {
        this.awake = false;
        System.out.println("Zzzz");
    }
    protected void eat() {
        this.hungry = true;
        System.out.println("Nom nom");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
