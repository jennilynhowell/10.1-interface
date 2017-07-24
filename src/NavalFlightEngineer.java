/**
 * Created by jennilynhowell on 7/24/17.
 */
public class NavalFlightEngineer extends Soldier implements AviatorExtended {
    @Override
    public Object newBomb() {
        System.out.println("Here is a new type of bomb for our planes.");
        return new Bomb();
    }

    @Override
    public String launchFromCarrier() {
        return "Taking off with new bomb.";
    }

    @Override
    public String flyJet() {
        return "Flying... wow this new bomb is heavy!";
    }

    @Override
    public String dropBombs() {
        return "Dropping new bomb... BOOOOOM!";
    }

    @Override
    protected void speak() {
        System.out.println("I engineer these flights.");
    }
}
