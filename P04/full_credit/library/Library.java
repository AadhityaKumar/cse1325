package library;

/**
 * Simulates a library.
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

    /**
     * Adds a publication to the ArrayList.
     *
     * @param publication            the publication being added
     * @since              1.0
     */
    public void addPublication(Publication publication)
    {
        publications.add(publication);
    }
    

     /**
     * Adds a patron to the ArrayList.
     *
     * @param patron            the patron being added
     * @since              1.0
     */
    public void addPatron(Patron patron)
    {
        patrons.add(patron);
    }

     /**
     * Changes the toString to print out the patrons.
     *
     * @since              1.0
     */
    public void patronMenu()
    {
        checker = 1;
    }
    /**
     * Changes the toString to print out the publications.
     *
     * @since              1.0
     */
    public void undopatronMenu()
    {
        checker = 0;
    }


    /**
     * Updates the loanedTo field of a publication.
     *
     * @param publicationIndex            the index of the publication being checked out
     * @param patron_index            the index of the patron checking out a publication
     * @since              1.0
     */
    public void checkOut(int publicationIndex, int patron_index)
    {
       publications.get(publicationIndex).checkOut(patrons.get(patron_index));
    }

    /**
     * Returns the library's name with a list of either publications or patrons.
     *
     * @return             The library's name with a list of either publications or patrons.
     * @since              1.0
     */
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