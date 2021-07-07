import java.io.File;
import java.util.Scanner;

public class DeleteFile {

	public void delete() {
		// TODO Auto-generated method stub
		 System.out.print("Enter the file Name to Delete : ");
		  System.out.println("");
	      

	      Scanner input = new Scanner(System.in);
	     
	      File file = new File(input.nextLine());

	    if (file.delete()) { 
	    	System.out.println();
	      System.out.println("		Deleted the file: " + file.getName());
	    } else {
	      System.out.println("		Failed to delete the file.(please Enter correct File name!)");
	    } 
	  } 
	}

