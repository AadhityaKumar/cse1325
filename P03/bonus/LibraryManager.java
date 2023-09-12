import java.util.Scanner;

public class LibraryManager {
    
    public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
    Library example = new Library("Caljeet World Library", 0);

    Publication uno = new Publication("IT", "Stephen King", 1986, null, null);
    Publication dos = new Publication("Harry Potter and the Philosopher's Stone", "JK Rowling", 1997, null, null);
    Publication tres = new Publication("Diary of a Wimpy Kid", "Jeff Kinny", 2007, null, null);

    example.addPublication(uno);
    example.addPublication(dos);
    example.addPublication(tres);

    Patron one = new Patron("Aadhitya Kumar (axk8897@mavs.uta.edu)");
    Patron two = new Patron("John Smith (john.smith@uta.edu)");
    Patron three = new Patron("George Rice (george.rice@uta.edu)");

    example.addPatron(one);
    example.addPatron(two);
    example.addPatron(three);

    System.out.println(example);

    


    try{
        System.out.println("\nWhich book would you like to check out today?");
        int checkout = myInput.nextInt();
        System.out.println("What is the name of the Patron?");
        myInput.nextLine();
        example.patronMenu();
        System.out.println(example);
        example.undopatronMenu();
        int patron_name = myInput.nextInt();
        checkout = checkout - 1;
        patron_name = patron_name - 1;

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