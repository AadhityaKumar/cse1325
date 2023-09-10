import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList <Publication> publications;

    public Library(String name)
    {
        this.name = name;
    }

    public addPublication(Publication publication)
    {
        publications.add(publication);
    }

    public checkOut(int publicationIndex, String patron)
    {
       publications.get(publicationIndex).checkOut(patron);
    }

    @Override
    public String toString()
    {
       return name;
    }

    //Ask how to print ArrayList with toString
}