package library;
/**
 * Models a Complex number.
 *
 * @author             Aadhitya Kumar
 * @version            1.0
 * @since              1.0
 * @license.agreement  Gnu General Public License 3.0
 */
import java.util.ArrayList;

public class Library {
    protected String name;
    protected String results;
    protected int ind;
    protected int checker;

    protected ArrayList <Publication> publications = new ArrayList <Publication>();
    protected ArrayList <Patron> patrons = new ArrayList <Patron>();



    public Library(String name, String results, int ind, int checker)
    {
        this.name = name;
        this.results = results;
        this.ind = ind;
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
            StringBuilder sb = new StringBuilder(name + "\n\n");
            for(int i=0; i<publications.size(); ++i)
                sb.append("" + i + ") " + publications.get(i).toString() + "\n");
            return sb.toString();
        }
       else
       {
            //return "Patrons: \n\n" + patrons;
            StringBuilder sb = new StringBuilder(name + "\n\n");
            for(int i=0; i<patrons.size(); ++i)
                sb.append("" + i + ") " + patrons.get(i).toString() + "\n");
            return sb.toString();
       }
    }

}