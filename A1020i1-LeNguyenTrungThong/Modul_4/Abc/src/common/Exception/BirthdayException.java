package common.Exception;

import java.io.IOException;

public class BirthdayException extends Exception{

    public static String checkBirthday(String birthday) throws IOException {
        String message = null;
        String regex = "(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:19\\d{2}|20[01][0-9]|2020)\\b";
        if (!birthday.matches(regex)) throw new IOException ("abc");
        return birthday;
    }
}
