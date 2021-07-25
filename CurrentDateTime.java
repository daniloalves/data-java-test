import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.Calendar;
import java.util.TimeZone;
import java.util.GregorianCalendar;

public class CurrentDateTime {    
  public static void main(String[] args) {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println("Date now: " + now);
   System.out.println("Format Date: " + dtf.format(now));  
   
   Calendar calendar = new GregorianCalendar();
   TimeZone timeZone = calendar.getTimeZone();
   System.out.println("TimeZone: " + timeZone);
  }    
}  
