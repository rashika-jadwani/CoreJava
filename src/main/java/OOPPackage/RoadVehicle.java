package OOPPackage;

public abstract class RoadVehicle implements IVehicle {

    public void howItMoves() {
        System.out.println("moves on road surface");
    }

    public abstract int noOfPassengers();

    public abstract void noOfWheels();

    public abstract void whichFuel();

    public abstract void mileage();

    public abstract void steering();
}
