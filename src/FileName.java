import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;

public class FileName {
	
	public static void FileName() {
		File dir = new File("C:\\");
		if (dir.isDirectory()) {
			 {
			      // Fetching the list from the directory
			      File[] files = dir.listFiles();

			      System.out.println("All the files including folders");
			      System.out.println("--------------------------------");
			      
			      //Lists only files since we have applied file filter
			      for(File file:files)
			      {
			        System.out.println(file.getName());
			      }
			   
			   // Creating a filter to return only files.
			      FileFilter fileFilter = new FileFilter()
			      {
			        @Override
			        public boolean accept(File file) {
			          return !file.isDirectory();
			        }
			      };
			   
			   files = dir.listFiles(fileFilter);
			   
			      System.out.println("\nAfter filtering the folders");
			      System.out.println("--------------------------------");

			      // Sort files by name
			      Arrays.sort(files, new Comparator()
			      {
			        @Override
			        public int compare(Object f1, Object f2) {
			          return ((File) f1).getName().compareTo(((File) f2).getName());
			        }
			      });

			      //Prints the files in file name ascending order
			      for(File file:files)
			      {
			        System.out.println(file.getName());
			      }
			      System.out.println("\nAfter sorting by name");
			      System.out.println("----------------------------------");	
			      for(File file:files)
			      {
			        System.out.println(file.getName());
			      }
			      System.out.println("-------------------------");
			    }
			 }
		}
	public void show() {
		// TODO Auto-generated method stub
		
	}
		
	}
		
	



