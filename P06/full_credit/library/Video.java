package library;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.LocalDate;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * Simulates a video and inherits from publication.
 *
 * @author             Aadhitya Kumar
 * @version            1.0
 * @since              1.0
 * @license.agreement  Gnu General Public License 3.0
 */
public class Video extends Publication {
    private int runtime;

    public Video(String title, String author, int copyright, Patron loanedTo, LocalDate dueDate, int runtime)
    {
        super(title, author, copyright, loanedTo, dueDate);
        this.runtime = runtime;


         if(runtime <= 0) 
        {
            throw new InvalidRuntimeException("Invalid book number.");
        } 
    }
/* 
    public Video(BufferedReader br) throws IOException {
        this.title  =                     br.readLine();
        this.author =                     br.readLine();
        this.copyright = Integer.parseInt(br.readLine());
        //this.loanedTo  =                  new Patron(br);
        //this.dueDate = LocalDate.parse(br.readLine());
        this.runtime = Integer.parseInt(br.readLine());
    }

    @Override
    public void save(BufferedWriter bw) throws IOException {
        bw.write(title       + '\n');
        bw.write("" + author    + '\n');
        bw.write("" + copyright  + '\n');
        //bw.write("" + loanedTo + '\n');
        //bw.write("" +  dueDate + '\n');
        bw.write("" + runtime  + '\n');

    }*/


    /**
     * Returns the video name and information, along with its patron name and due date if checked out.
     *
     * @return             the video name and information, along with its patron name and due date if checked out.
     * @since              1.0
     */
    @Override
    public String toString()
    {

        if(loanedTo == null)
        {
        return title + ", " + author + ", " + "copyright " + copyright + ", " + "runtime " + runtime;
        }
        else
        {
        return title + ", " + author + ", " + "copyright " + copyright + ", " + "runtime " + runtime + ", " + "loaned to: " + loanedTo + " until " + dueDate;
        }
    }
}