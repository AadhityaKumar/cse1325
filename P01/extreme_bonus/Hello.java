import java.net.*;
//import java.rmi.UnknownHostException;

public class Hello {
    public static void main(String[] args) {
    try{
    InetAddress my_address = InetAddress.getLocalHost();
    System.out.println("Hello, " + my_address.getHostName());
    System.out.println();
    }
    catch (UnknownHostException e){
        System.out.println( "Could not find host name.");
    }
    }
    }