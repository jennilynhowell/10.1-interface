/**
 * Created by jennilynhowell on 7/24/17.
 */
public class Bomb {
    public String type;
    public double weightInPounds;

    public Bomb() {
    }

    public String toString() {
        System.out.println("Here's my new bomb.");
        return "Here's my new bomb.";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
}
