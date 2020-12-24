package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {


    public static void main(String[] args) throws Throwable {
        try {
            callTestChild();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            doNothing();
        }

        ExceptionTest t1 = new TestChild();
        System.out.println(t1.hashCode());
        t1.finalize();
        t1 = new ExceptionTest();
        System.out.println(t1.hashCode());

        System.gc();




        //System.out.println(30/0);

       /* int arr[] = {1,2,3,4,5};
        System.out.println(arr[5]);*/
//        FileInputStream fis1 = new FileInputStream("");
       /* try {
//            FileInputStream fis = new FileInputStream("");
            System.out.println(30/0);
//            ??
        }catch (ArithmeticException ae){
            System.out.println("caught");
        }
        catch (Exception e){
            e.printStackTrace();
//            System.out.println("file not found exception has been catched");
        }finally {
            System.out.println("hi");
        }
        System.out.println("hi");
*/
    }

    public static void callTestChild() throws FileNotFoundException {

        TestChild.readFile();
    }

    public static void doNothing(){
        System.out.println("Nothing");
    }
}
