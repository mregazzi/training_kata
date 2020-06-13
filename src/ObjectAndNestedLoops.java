import java.time.LocalDate;
import java.time.format.*;

public class ObjectAndNestedLoops {
    public static void main(String[] args){
        String year = args[0];
        String month = args[1];
        String day = args[2];
        String myDate = year + " " + month + " " + day;
        String[] date = myDate.split(" ");
        LocalDate localDate = LocalDate.of(Integer.parseInt(date[0]),Integer.parseInt(date[1]),Integer.parseInt(date[2]));
        String formattedLocalDate = localDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println(formattedLocalDate);
    }
}
