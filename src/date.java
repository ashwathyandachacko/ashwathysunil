import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(sdf.format(date));
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
        LocalTime time=LocalTime.now();
        System.out.println(time);

    }
}
