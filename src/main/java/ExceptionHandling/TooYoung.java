package ExceptionHandling;

public class TooYoung extends RuntimeException {

   public TooYoung(String s){
       super(s);
   }
}
