package objectConstructorPackageWithOOP;

public class ClassBeta extends ClassAlpha{

    int noOfYears;

    public ClassBeta(){
        System.out.println("Beta");
    }



    @Override
    public void method1(){
        System.out.println("mai hoon Beta");
    }

    public void methodBeta(){
        System.out.println("mai hoon methodBeta");
    }
}
