import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Publication {
    private String title;
    private String author;
    private int copyright;
    private String loanedTo;
    private LocalDate dueDate;

    public Publication(String title, String author, int copyright, String loanedTo, LocalDate dueDate)
    {
        this.title = title;
        this.author = author;
        this.copyright = copyright;
        this.loanedTo = loanedTo;
        this.dueDate = dueDate;

        if(copyright < 1900 || copyright > 2023) throw new IllegalArgumentException("Invalid copyright year.");
    }

    public void checkOut(String patron)
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
        return " \n" + title + ", " + author + ", " + "copyright " + copyright;
        }
        else
        {
        return "\n" + title + ", " + author + ", " + "copyright " + copyright + ", " + "loaned to: " + loanedTo + " until " + dueDate;
        }

    }
}