import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList <Publication> publications = new ArrayList <Publication>();


    public Library(String name)
    {
        this.name = name;
    }

    public void addPublication(Publication publication)
    {
        publications.add(publication);
    }

    public void checkOut(int publicationIndex, String patron)
    {
       publications.get(publicationIndex).checkOut(patron);
    }

    @Override
    public String toString()
    {
       return "Welcome to " + name + "\n" + publications;
    }

}