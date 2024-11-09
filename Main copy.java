public class Main {
    public static void main(String[] args) {

        //Drones created by manufacturer A
        DroneFactory manufacturera = new ManufacturerA();
        Drone surveillance1 = manufacturera.createSurveillanceDrone();
        Drone delivery1 = manufacturera.createDeliveryDrone();
        Drone agriculture1 = manufacturera.createAgriculturalDrone();

        //Display features for surveillance drone by manufacturere a
        System.out.println("Surveillance Drone produced by Manufacturer A: " +
                "\n Battery Life: " + surveillance1.battery() + " mAh" +
                "\n Flight Range: " + surveillance1.getFlightRange() + " kilometers" +
                "\n Special Feature: " + surveillance1.getSpecialFeature());

        //Drones created by manufacturer B
        DroneFactory manufacturerb = new ManufacturerB();
        Drone surveillance2 = manufacturerb.createSurveillanceDrone();
        Drone delivery2 = manufacturerb.createDeliveryDrone();
        Drone agriculture2 = manufacturerb.createAgriculturalDrone();

        //Display features for delivery drone by manufacturer b
        System.out.println("\nDelivery Drone produced by Manufacturer B: " +
                "\n Battery Life: " + delivery2.battery() + " mAh" +
                "\n Flight Range: " + delivery2.getFlightRange() + " kilometers" +
                "\n Special Feature: " + delivery2.getSpecialFeature());



    }
}
