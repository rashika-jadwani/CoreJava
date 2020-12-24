package OOPPackage;

public abstract class AirVehicle  implements IVehicle {
    public void howItMoves() {
        System.out.println("flies in air");
    }

    public abstract int noOfPassengers();

    public void whichFuel() {
        System.out.println("jet fuel");
    }
}
