public class SurveillanceDrone implements Drone {
    int battery;
    int flightRange;
    String specialFeature;
    // Constructor to initialize the Surveillance Drone
    public SurveillanceDrone (int battery, int flightRange, String specialFeature) {
        this.battery = battery;
        this.flightRange = flightRange;
        this.specialFeature = specialFeature;
    }
    //Override methods and return properties
    @Override
    public int battery() {
        return battery;
    }

    @Override
    public int getFlightRange() {
        return flightRange;
    }

    @Override
    public String getSpecialFeature() {
        return specialFeature;
    }

}

