package library;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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

    public void checkOut(Patron patron)
    {
        dueDate = LocalDate.now();
        dueDate = dueDate.plusDays(14);
        loanedTo = patron;
    }

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