package OOPPackage;

public abstract class MarineVehicle implements IVehicle {

    public void howItMoves() {
        System.out.println("floats on water");
    }

    public abstract int noOfPassengers();

    public void whichFuel() {
        System.out.println("consumes ship fuel");
    }
}
