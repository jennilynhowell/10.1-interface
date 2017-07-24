/**
 * Created by jennilynhowell on 7/24/17.
 */
public interface Sharpshooter {
    public String hideout();
    public String acquireTarget();
    public String fireRifle();

    default String targetPractice() {
        return "";
    }
}
