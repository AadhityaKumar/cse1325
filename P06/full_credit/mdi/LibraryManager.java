package mdi;
import library.Library;
import library.Publication;
import library.Video;
import library.Patron;
import library.InvalidRuntimeException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;


public class LibraryManager {
    
    public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
    Library example = new Library("Caljeet World Library", "\n", 0, 0);

    Publication uno = new Publication("IT", "Stephen King", 1986, null, null);
    Publication dos = new Publication("Harry Potter and the Philosopher's Stone", "JK Rowling", 1997, null, null);
    Publication tres = new Publication("Diary of a Wimpy Kid", "Jeff Kinny", 2007, null, null);
    Video quatro = new Video("Saw", "Lionsgate Films", 2004, null, null, 100);
    Video cinco = new Video("Kung Fu Panda", "Dreamworks", 2008, null, null, 91);
    Video seis = new Video("Thomas and the Magic Railroad", "Warner Bros.", 2000, null, null, 89);


    example.addPublication(uno);
    example.addPublication(dos);
    example.addPublication(tres);
    example.addPublication(quatro);
    example.addPublication(cinco);
    example.addPublication(seis);
    int publication_num = 5;

    Patron one = new Patron("Aadhitya Kumar (axk8897@mavs.uta.edu)");
    Patron two = new Patron("John Smith (john.smith@uta.edu)");
    Patron three = new Patron("George Rice (george.rice@uta.edu)");

    example.addPatron(one);
    example.addPatron(two);
    example.addPatron(three);


    
try{
    while(1<10)
    {
        example.patronMenu(2);
        System.out.println(example);
        example.undopatronMenu();

        System.out.println("=========\n" + "Main Menu\n" + "=========");
        System.out.println("0) Exit\n" + "1) List Publications\n" + "2) Add Publication \n" + "3) Check out\n" + "4) Check in\n" + "5) List Patrons\n" + "6) Add Patron\n" 
        + "7) Save\n");
        int selection_menu = myInput.nextInt();

        switch(selection_menu)
        {
            case 0: 
                System.exit(0);
                break;
            case 1: 
                System.out.println(example); 
                break;
            case 2: 
                System.out.println("Enter the publication's title.");
                myInput.nextLine();
                String title = myInput.nextLine(); 
                
                System.out.println("Enter the publication's author.");
                String author = myInput.nextLine();
                
                System.out.println("Enter the publication's copyright year.");
                int cpyright = myInput.nextInt();
                myInput.nextLine();

                System.out.println("Is this publication a video?\n1) Yes\n2) No\n");
                int video_or_not = myInput.nextInt();
                
                if(video_or_not == 1)
                {
                    System.out.println("Enter the publication's runtime.");
                    int run = myInput.nextInt();
                    Video mega = new Video(title, author, cpyright, null, null, run); 
                    example.addPublication(mega);
                }
                else
                {
                    Publication ultra = new Publication(title, author, cpyright, null, null); 
                    example.addPublication(ultra);
                }
                
                publication_num++;
                break;
            case 3: 
                System.out.println(example); 

                System.out.println("\nWhich book would you like to check out today?");
                int checkout = myInput.nextInt();

                System.out.println("What is the name of the Patron?");

                if(checkout < 0 || checkout > publication_num) 
                    throw new IllegalArgumentException("Invalid book number.");
        
                myInput.nextLine();
                example.patronMenu(1);
                System.out.println(example);
                example.undopatronMenu();
                int patron_name = myInput.nextInt();
        
                example.checkOut(checkout, patron_name);
                
                System.out.println("\n");
                System.out.println(example); 
                break;
            case 4: 
                System.out.println(example); 

                System.out.println("\nWhich book would you like to check in today?");
                int checkin = myInput.nextInt();

                if(checkin < 0 || checkin > publication_num) 
                    throw new IllegalArgumentException("Invalid book number.");
        
                example.checkIn(checkin);
                
                System.out.println("\n" + example);
                 
                break;
            case 5:
                example.patronMenu(1);
                System.out.println(example);
                example.undopatronMenu();
                break;
            case 6: 
                System.out.println("What is the name of the new Patron?");
                myInput.nextLine();
                String name_of_patron = myInput.nextLine();

                Patron omega = new Patron(name_of_patron);
                example.addPatron(omega);

                break;
            case 7: 
                System.out.println("Enter the filename.");
                String filename = myInput.nextLine();
                try(BufferedWriter lib = new BufferedWriter(new FileWriter(filename)))
                {
                    example.save(lib)
                }
                } catch (Exception e) {
                    System.err.println("Failed to write: " + e);
                    System.exit(-1);
                }

                break;
            /*case 8:
                
                break;*/
            default: 
                System.out.println("Enter a valid number."); 
                break;
        }
 


    }
}
catch(Exception e)
    {
        System.err.println(e.getMessage());
        System.exit(-1);
    }
    


    


    
    }
    
}