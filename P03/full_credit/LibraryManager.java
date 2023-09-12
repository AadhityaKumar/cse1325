import java.util.Scanner;

public class LibraryManager {
    
    public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
    Library example = new Library("Caljeet World Library", "\n", 0);

    Publication uno = new Publication("IT", "Stephen King", 1986, null, null);
    Publication dos = new Publication("Harry Potter and the Philosopher's Stone", "JK Rowling", 1997, null, null);
    Publication tres = new Publication("Diary of a Wimpy Kid", "Jeff Kinny", 2007, null, null);

    example.addPublication(uno);
    example.addPublication(dos);
    example.addPublication(tres);

    System.out.println(example);

    


    try{
        System.out.println("\nWhich book would you like to check out today?");
        int checkout = myInput.nextInt();
        System.out.println("What is the name of the Patron?");
        myInput.nextLine();
        String patron_name = myInput.nextLine();
        checkout = checkout - 1;

        if(checkout < 0 || checkout > 2) 
            throw new IllegalArgumentException("Invalid book number.");   

        example.checkOut(checkout, patron_name);
        
        System.out.println("\n");
        System.out.println(example);


 }
    catch(Exception e)
    {
        System.err.println(e.getMessage());
        System.exit(-1);
    }
    


    
    }
    
}