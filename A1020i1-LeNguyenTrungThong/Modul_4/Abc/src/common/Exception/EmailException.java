package common.Exception;

public class EmailException extends Exception{
    private String exceptionEmail;

    public EmailException(String exceptionEmail) {
        this.exceptionEmail = exceptionEmail;
    }

    public String getExceptionEmail() {
        return exceptionEmail;
    }

    public void setExceptionEmail(String exceptionEmail) {
        this.exceptionEmail = exceptionEmail;
    }
}
