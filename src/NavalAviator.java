/**
 * Created by jennilynhowell on 7/24/17.
 */
public class NavalAviator extends Soldier implements Aviator {

    @Override
    public String launchFromCarrier() {
        return "3, 2, 1... Launched!";
    }

    @Override
    public String flyJet() {
        return "Whooooosh";
    }

    @Override
    public String dropBombs() {
        return "Boom!";
    }

    @Override
    protected void speak() {
        System.out.println("Fly Navy");
    }

}
