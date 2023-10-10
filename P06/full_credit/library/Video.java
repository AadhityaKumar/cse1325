package library;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.LocalDate;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

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