package OOPPackage;

public class BajajPulsar extends Bike {

    boolean hasAlloyWheels = false;
    private String color = "black";


    public BajajPulsar(boolean hasAlloyWheels) {
        this.hasAlloyWheels = hasAlloyWheels;
        if (hasAlloyWheels) {
            System.out.println("Bike is ready with Alloy Wheels");
        }else System.out.println("Bike is ready with Steel Wheels");
    }

    public void whichFuel() {
        System.out.println("runs on Petrol");
    }

    public void mileage() {
        System.out.println("has mileage of 50kmpl");
    }

    public void setColor(String color){
        this.color = color;
        System.out.println("Bike with color " +color + " has been applied on your vehicle.. Yuhuuuuu");
    }

    public String getColor(){
        return this.color;
    }
}
