import java.io.FileOutputStream;
import java.util.Scanner;

public class AddFile {

	public void create() {
		// TODO Auto-generated method stub
		{
			String p=setpath();
			try {
				write(p);
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
			System.out.println("\n File added ");}
			
		}
		static String setpath()
		{
			Scanner read=new Scanner(System.in);
			String path;
			System.out.println("Enter File Name with  (*extention*):");
			return read.nextLine();
			
		}
		static void write(String path)throws Exception
		{
			Scanner sc= new Scanner(System.in);
			FileOutputStream fos=new FileOutputStream(path);
		}

	}

