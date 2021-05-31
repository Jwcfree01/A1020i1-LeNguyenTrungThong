package common;

public class Validate {
    public static String nameCustomer(String name) {
        String message = null;
        String regex = "([KH]{2}[-]{1}[0-9]{4})$";
        if (!name.matches(regex)) {
            message = "Not OK. Customer name invalid";
        }
        return message;
    }

    public static String idService(String nameService) {
        String message = null;
        String regex = "([DV]{2}[-]{1}[0-9]{4})$";
        if (!nameService.matches(regex)) {
            message = "Not OK. Customer name invalid";
        }
        return message;
    }

    public static String phone(String phone) {
        String message = null;
        String regex = "(090|091)+([0-9]{7})$";
        if (!phone.matches(regex)) {
            message = "Not OK. Customer name invalid";
        }
        return message;
    }

    public static String cmnd(String cmnd) {
        String message = null;
        String regex = "([0-9]{9})$";
        if (!cmnd.matches(regex)) {
            message = "Not OK. Customer name invalid";
        }
        return message;
    }

    public static String email(String name) {
        String message = null;
        String regex = "(([^<>()[\\]\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@(([^<>()[\\]\\.,;:\\s@\\\"]+\\.)+[^<>()[\\]\\.,;:\\s@\\\"]{2,})$";
        if (!name.matches(regex)) {
            message = "Not OK. Customer name invalid";
        }
        return message;
    }


}
