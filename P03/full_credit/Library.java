import java.util.ArrayList;

public class Library {
    private String name;
    private String results;
    private int ind;

    private ArrayList <Publication> publications = new ArrayList <Publication>();


    public Library(String name, String results, int ind)
    {
        this.name = name;
        this.results = results;
        this.ind = ind;
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
        results = "\n";
        for (int i = 0; i < this.publications.size(); i++) {
            ind = i + 1;
            results +=  ind + ". " + this.publications.get(i) + "\n";
        }
       
       
        return "Welcome to " + name + results;
    }

}