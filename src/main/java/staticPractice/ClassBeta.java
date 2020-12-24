package staticPractice;

public class ClassBeta {

    static int counter = 0;
    int counter1 = 0;
    public static void main(String[] args) {
        System.out.println("Beta's main method");
        ClassAlpha.method1();
        ClassAlpha objAlpha = new ClassAlpha();
        objAlpha.method2();
        method3();
        ClassBeta objBeta = new ClassBeta();
        objBeta.method4();

    }

    public static void method3(){
        System.out.println("Static Method called - Beta");
        method5();
        method3();
    }

    public void method4(){
        System.out.println("Instance method called - Beta");
    }

    public static void method5(){
        System.out.println("Static Method called - Beta");

    }


}
