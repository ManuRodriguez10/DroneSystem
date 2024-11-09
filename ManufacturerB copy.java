
public class ManufacturerB implements DroneFactory{
    //Manufacturer B focuses on drones with longer flight range
    @Override
    // Method to create a Surveillance Drone
    public SurveillanceDrone createSurveillanceDrone() {
        return new SurveillanceDrone(500,100,"High Quality Camera");
    }

    @Override
    // Method to create a Delivery Drone
    public DeliveryDrone createDeliveryDrone() {
        return new DeliveryDrone(500,150,"High Quality GPS");
    }

    @Override
    // Method to create a Agriculture Drone
    public AgriculturalDrone createAgriculturalDrone() {
        return new AgriculturalDrone(500,200,"Long distance spraying");
    }
}
