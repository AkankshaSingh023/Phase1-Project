import java.util.Scanner;


public class FileOptionMenu {

	public static int FileOptionMenu() {
		Scanner in= new Scanner(System.in);
		System.err.println("FILE OPTION MENU");
		System.out.println("1. Add a new file");
		System.out.println("2. Delete a user specified file");
		System.out.println("3. Search a file");
		System.out.println("0. Back to main context");
		System.out.println("Select File option Menu");


		System.out.println();

		//Get user's choice
		int choice=in.nextInt();


		//Display the Title of the Chosen module

		switch(choice) {
		case 1:
			System.out.println(" Add a new file:");
			AddFile  af= new AddFile ();
			af.create();
			break;
			
			
		case 2:
			System.out.println(" Delete a file:");
			DeleteFile df= new DeleteFile ();
			df.delete();
			break;

		case 3:
			
			System.out.println(" Search a file:");
		SearchFile search= new  SearchFile();
		search.search();
		break;
			
		case 0:
			FileOptionMenu();
	
		default:
				System.out.println("invalid option");
		}
		return choice;




			}

	
	}

