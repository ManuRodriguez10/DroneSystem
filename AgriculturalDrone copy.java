
public class AgriculturalDrone implements Drone{
    int battery;
    int flightRange;
    String specialFeature;
    // Constructor to initialize the Agriculture Drone
    public AgriculturalDrone (int battery, int flightRange, String specialFeature) {
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
