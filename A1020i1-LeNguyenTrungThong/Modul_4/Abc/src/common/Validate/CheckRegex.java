package common.Validate;

public class CheckRegex {

    public static boolean checkEmail(String email) {
        String regexEmail = "(?:^|\\s)[\\w!#$%&'*+/=?^`{|}~-](\\.?[\\w!#$%&'*+/=?^`{|}~-]+)*@\\w+[.-]?\\w*\\.[a-zA-Z]{2,3}\\b";
        if (!email.matches(regexEmail)){
            return false;
        }else {
            return true;
        }
    }


    public static boolean checkBirthday(String birthday) {
        String message = null;
        String regex = "(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:19\\d{2}|20[01][0-9]|2020)\\b";
        if (!birthday.matches(regex)) {
            message = "Not OK. Customer birthday invalid";
            return false;
        } else {
            return true;
        }
    }

}