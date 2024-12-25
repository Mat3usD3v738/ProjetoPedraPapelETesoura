package I_Datas;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd/MM/YYYY ");
        Date date = new Date();
        System.out.println(sdf.format(date));

    }


    }

