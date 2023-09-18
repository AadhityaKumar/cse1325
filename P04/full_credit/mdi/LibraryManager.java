package mdi;
import library.Library;
import library.Publication;
import library.Video;
import library.Patron;
import library.Rot13Exception;

import java.util.Scanner;


public class LibraryManager {
    
    public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
    Library example = new Library("Caljeet World Library", "\n", 0, 0);

    Publication uno = new Publication("IT", "Stephen King", 1986, null, null);
    Publication dos = new Publication("Harry Potter and the Philosopher's Stone", "JK Rowling", 1997, null, null);
    Publication tres = new Publication("Diary of a Wimpy Kid", "Jeff Kinny", 2007, null, null);
    Video quatro = new Video("Bamboo", "ME", 2009, null, null, 45);


    example.addPublication(uno);
    example.addPublication(dos);
    example.addPublication(tres);
    example.addPublication(quatro);
    example.addPublication(new Video("hellow", "ME", 2009, null, null, 50));

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

        if(checkout < 0 || checkout > 4) 
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