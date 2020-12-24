package OOPPackage;

public abstract class Car extends RoadVehicle {

    public void noOfWheels() {
        System.out.println("has 4 weheeeeels");
    }

    public void steering(){
        System.out.println("has steering wheel");
    }

    public void noOfEntries(){
        System.out.println("has 4 doors");
    }

    public abstract void bootSpace();
}
