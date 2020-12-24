package OOPPackage;

public abstract class Bike extends RoadVehicle {

    public int noOfPassengers(){
        return 2;
    }

    public void noOfWheels() {

        System.out.println("has 2 wheeeeels");
    }

    public void steering(){

        System.out.println("has steering handle");
    }

    public abstract int topSpeed();
}


