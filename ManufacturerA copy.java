public class ManufacturerA implements DroneFactory {

    // Manufacturer A focuses on creating drones with longer battery life

    @Override
    // Method to create a SurveillanceDrone
    public SurveillanceDrone createSurveillanceDrone() {
        return new SurveillanceDrone(1500, 25, "High Quality Camera");
    }

    @Override
    // Method to create a DeliveryDrone
    public DeliveryDrone createDeliveryDrone() {
        return new DeliveryDrone(2000, 50, "Higher battery life for longer deliveries");
    }

    @Override
    // Method to create an AgriculturalDrone
    public AgriculturalDrone createAgriculturalDrone() {
        return new AgriculturalDrone(1250, 65, "Water spraying");
    }
}
