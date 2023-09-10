import java.time.LocalDate;

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
    }

    public checkOut(String patron)
    {
        dueDate = currentLocalDateTime.plusDays(14);
        loanedTo = patron;
    }

    @Override
    public String toString()
    {
        if(loanedTo = NULL)
        {
            return title + author + "copyright" + copyright;
        }
        else
        {
            return title + author + "copyright" + copyright + "loaned to:" + loanedTo + "until" + dueDate;
        }
    }
}