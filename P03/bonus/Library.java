import java.util.ArrayList;

public class Library {
    private String name;
    private int checker;
    private ArrayList <Publication> publications = new ArrayList <Publication>();
    private ArrayList <Patron> patrons = new ArrayList <Patron>();



    public Library(String name, int checker)
    {
        this.name = name;
        this.checker = checker;
    }

    public void addPublication(Publication publication)
    {
        publications.add(publication);
    }

    public void addPatron(Patron patron)
    {
        patrons.add(patron);
    }

    public void patronMenu()
    {
        checker = 1;
    }

    public void undopatronMenu()
    {
        checker = 0;
    }

    public void checkOut(int publicationIndex, int patron_index)
    {
       publications.get(publicationIndex).checkOut(patrons.get(patron_index));
    }

    @Override
    public String toString()
    {
       if(checker == 0)
       {
        return "Welcome to " + name + "\n" + publications;
       }
       else
       {
       return "Patrons: \n\n" + patrons;
       }
        
    }

}