package filehandling;

public class FileCreate
{
  public static void main(String[] args)
	   {
	       File folder=new File("D:\\Trainning\\FileHandling\\Practice\\SubFolder\\test.xls");
	        boolean present=folder.exists();
	        if(present ==false)
	        try 
	       {
	        	boolean created =folder.createNewFile();
	        	System.out.println("File created "+ created);
	        }
        catch(IOException v)
        	{
        	System.out.println("error occured");
	        }
	    }
}
