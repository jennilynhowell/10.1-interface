/**
 * Created by jennilynhowell on 7/24/17.
 */
public class MarineSniper extends Soldier implements Sharpshooter {
    @Override
    public String hideout() {
        return "Concealed on the hill above the village.";
    }

    @Override
    public String acquireTarget() {
        return "Target acquired.";
    }

    @Override
    public String fireRifle() {
        return "BOOM - Bad guy is down.";
    }

    @Override
    protected void speak() {
        System.out.println("Semper Fi");
    }

    @Override
    public String targetPractice() {
        return "Practice requirements met today.";
    }
}
