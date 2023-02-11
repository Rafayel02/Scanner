package am.threesmart.beacon_scanner;

public class BeaconScanner {

    private static String health = "STOPPED";

    private BeaconScanner() {
    }

    public static void start() {
        health = "RUNNING";

        // TODO implement logic
    }

    public static String healthCheck() {
        return health;
    }

}
