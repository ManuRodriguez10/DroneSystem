public interface DroneFactory {

    SurveillanceDrone createSurveillanceDrone(); // Method to create a SurveillanceDrone

    DeliveryDrone createDeliveryDrone(); // Method to create a DeliveryDrone

    AgriculturalDrone createAgriculturalDrone(); // Method to create an AgriculturalDrone

}