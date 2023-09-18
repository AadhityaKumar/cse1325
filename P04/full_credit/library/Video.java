package library;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.LocalDate;


public class Video extends Publication {
    private int runtime;

    public Video(String title, String author, int copyright, Patron loanedTo, LocalDate dueDate, int runtime)
    {
        super(title, author, copyright, loanedTo, dueDate);
        this.runtime = runtime;


         if(runtime <= 0) 
        {
            throw new Rot13Exception("Invalid book number.");
        } 
    }
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