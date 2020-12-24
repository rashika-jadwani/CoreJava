package Enums;

public class TestEnums {
    public static void main(String[] args) {
        testingEnums(DaysOfWeek.FRIDAY);
        DaysOfWeek doW = DaysOfWeek.MONDAY;
        doW.main();
    }

    public static void testingEnums(DaysOfWeek d){

        System.out.println(d.toString());
    }

}
