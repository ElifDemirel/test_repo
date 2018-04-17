import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {    
        
        System.out.println(displayMsg() + "\ndate & time: " + displayDate());     
        
    }
    public static String displayDate() {
        
        Date date = new Date();
		
		
		
        return date.toString();
        
    }
    public static String displayMsg() {
        
        return "hello world";
        
    }
}
