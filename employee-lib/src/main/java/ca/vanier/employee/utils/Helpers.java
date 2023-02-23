package ca.vanier.employee.utils;

public class Helpers {
    
    public static String createAddressesEndpoint(String basePath) {
        return basePath + Constants.ADDR_PATH + "/base";
    }

}
