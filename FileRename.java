package filehandling;

public class FileRename 
{
  public static void main(String[] args)
	   {    
	    File folder=new File("D:\\Training\\FileHandling\\Practice\\SubFolder\\test.xls");
	                    
	     File newName=new File("D:\\Training\\FileHandling\\Practice\\SubFolder\\Renamed.xls");
	      boolean renameSuccess=folder.renameTo(newName);
	      System.out.println("renameSuccess "+ newName);
	    }
}
