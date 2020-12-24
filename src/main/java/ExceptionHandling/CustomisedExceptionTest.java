package ExceptionHandling;

public class CustomisedExceptionTest {
    public static void main(String[] args) {
        checkAge(62);
    }

    private static void checkAge(int age) {
        if (age > 60) {

            throw new TooOld("Greater");
        }

        else if (age < 18){
            throw new TooYoung("lesser");
        }

        else {
            System.out.println("perfect age!!");
        }

    }


}
