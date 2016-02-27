package sample.webapi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDate {

    static public final String DATE_PATTERN = "yyyy/MM/dd HH:mm:ss";

    public static String parseDateToString(Date date) {
        String str;
        if (date == null) {
            str = null;
        } else {
            str = new SimpleDateFormat(DATE_PATTERN).format(date);
        }
        return str;
    }
}
