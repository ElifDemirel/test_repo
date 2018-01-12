import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {
        
        String hellomsg = "hello world";
        
        
        System.out.println(hellomsg + "\nDate and Time: " + displayDate());
        ;
    }
    public static String displayDate() {
        Date date = new Date();
        return date.toString();
    }
}