package common.Exception;

public class MyException extends Exception{
    private String exceptionBirthday;
    private String exceptionEmail;

    public MyException(String exceptionBirthday, String exceptionEmail) {
        super();
        this.exceptionBirthday = exceptionBirthday;
        this.exceptionEmail = exceptionEmail;
    }

//    public MyException(String s) {
//    }

    public String getExceptionBirthday() {
        return exceptionBirthday;
    }

    public void setExceptionBirthday(String exceptionBirthday) {
        this.exceptionBirthday = exceptionBirthday;
    }

    public String getExceptionEmail() {
        return exceptionEmail;
    }

    public void setExceptionEmail(String exceptionEmail) {
        this.exceptionEmail = exceptionEmail;
    }
}
