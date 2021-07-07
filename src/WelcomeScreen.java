import java.awt.event.WindowEvent;
import java.util.Scanner;



public class WelcomeScreen {
	public static void main(String[] args) {
		System.out.println("Welcome to LockedMe.com!\nDeveloper: Akanksha Singh");
		 Scanner input = new Scanner (System.in);
		    System.out.print("Input your first name: ");
		    String fname = input.next();
		    System.out.print("Input your last name: ");
		    String lname = input.next();
		    System.out.println();
		    System.out.println("Hello \n"+fname+" "+lname);
		 
		    System.out.println(" 1.show all file names in ascending order in Directory");
		    System.out.println(" 2.File Option Menu");
		    System.out.println(" 3.Exit");


		    System.out.println();
		    System.out.println(" Enter the option:");


		    //get user choice

		    int choice = input.nextInt();

		    //Display the title of the chosen  module
		    switch (choice)
		    {
		    case 1:
		    	FileName fn=new FileName();
		    	FileName.FileName();
		    	break;
		    	
		    case 2:
		    	FileOptionMenu fom=new FileOptionMenu();
		    	FileOptionMenu.FileOptionMenu();
		    	break;
		    	
		    case 3:
		    	main(null);;
		    	break;
		    default:
		    		System.err.println("Invalid option");
		    }
		    return;
		    	}
}

		
	
			
	

