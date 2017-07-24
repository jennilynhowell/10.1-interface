public class Main {

    public static void main(String[] args) {

        NavalAviator navyFlier = new NavalAviator();
        navyFlier.speak();
        System.out.println(navyFlier.launchFromCarrier());
        System.out.println(navyFlier.flyJet());
        System.out.println(navyFlier.dropBombs());

        MarineSniper badAssDude = new MarineSniper();
        badAssDude.speak();
        System.out.println(badAssDude.hideout());
        System.out.println(badAssDude.acquireTarget());
        System.out.println(badAssDude.fireRifle());


        NavalFlightEngineer flightEngineer = new NavalFlightEngineer();
        flightEngineer.newBomb().toString();

        System.out.println(badAssDude.targetPractice());
    }
}
