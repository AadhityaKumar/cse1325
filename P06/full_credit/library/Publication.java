package library;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.BufferedReader;


/**
 * Simulates a publication.
 *
 * @author             Aadhitya Kumar
 * @version            1.0
 * @since              1.0
 * @license.agreement  Gnu General Public License 3.0
 */
public class Publication {
    

    public Publication(String title, String author, int copyright, Patron loanedTo, LocalDate dueDate)
    {
        this.title = title;
        this.author = author;
        this.copyright = copyright;
        this.loanedTo = loanedTo;
        this.dueDate = dueDate;

        if(copyright < 1900 || copyright > 2023) throw new IllegalArgumentException("Invalid copyright year.");
    }

    public Publication(BufferedReader br) throws IOException {
        this.title  =                     br.readLine();
        this.author =                     br.readLine();
        this.copyright = Integer.parseInt(br.readLine());

        String cheky = br.readLine();
        if(cheky.equals("Checked in"))
        {
            loanedTo = null;
            dueDate = null;
        }
        else
        {
            
            this.loanedTo  =            new Patron(cheky);
            this.dueDate = LocalDate.parse(br.readLine());
        }
    }

    /**
     * Adds a patron name to loanedTo and adds a due date.
     *
     * @param patron            the real component of the Complex number
     * @since              1.0
     */
    public void checkOut(Patron patron)
    {
        dueDate = LocalDate.now();
        dueDate = dueDate.plusDays(14);
        loanedTo = patron;
    }

    public void save(BufferedWriter bw) throws IOException {
        bw.write(title       + '\n');
        bw.write("" + author    + '\n');
        bw.write("" + copyright  + '\n');
        if(loanedTo == null)
        {
            bw.write("" + "Checked in" + '\n');
        }
        else
        {
            bw.write("" + loanedTo + '\n');
            bw.write("" +  dueDate + '\n');
        }
    }

    public void checkIn()
    {
        loanedTo = null;
        dueDate = null;
    }

    /**
     * Returns the publication name and information, along with its patron name and due date if checked out.
     *
     * @return             the publication name and information, along with its patron name and due date if checked out.
     * @since              1.0
     */
    @Override
    public String toString()
    {
        
        if(loanedTo == null)
        {
        return title + ", " + author + ", " + "copyright " + copyright;
        }
        else
        {
        return title + ", " + author + ", " + "copyright " + copyright + ", " + "loaned to: " + loanedTo + " until " + dueDate;
        }

    }

    protected String title;
    protected String author;
    protected int copyright;
    protected Patron loanedTo;
    protected LocalDate dueDate;
}