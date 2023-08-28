import java.net.*;

public class Name {
    public static void main(String[] args) {
    
    InetAddress my_address = InetAddress.getLocalHost();
    System.out.println("Hello, " + my_address.getHostName());
    System.out.println();
    }
    }