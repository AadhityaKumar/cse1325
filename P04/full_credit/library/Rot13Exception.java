package library;

public class Rot13Exception extends IllegalArgumentException{
    
    public Rot13Exception() {super();}

    public Rot13Exception(String message) {super(message);}

    public Rot13Exception(Throwable err) {super(err);}

    public Rot13Exception(String message, Throwable err) {super(message, err);}

    public Rot13Exception(int runtime, String title)
    {
        super(title + "has Invalid runtime of" + runtime + "minutes.");
    }
}