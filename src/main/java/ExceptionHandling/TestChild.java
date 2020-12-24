package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestChild extends ExceptionTest {

    public static void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("");

    }
}
