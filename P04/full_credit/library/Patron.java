package library;
public class Patron {
    private String patron_name;

    public Patron(String patron_name)
    {
        this.patron_name = patron_name;
    }

    @Override
    public String toString()
    {
        return patron_name;
    }

}