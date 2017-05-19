import java.io.File;
import java.io.FilenameFilter;
class file_by_extension
{
    public static void main(String args[])
    {
        File file = new File("/home/cm/");
	String[] list = file.list(new FilenameFilter()
	    {
		public boolean accept(File dir, String name)
		{
		    if(name.toLowerCase().endsWith(".txt"))
			{
			    return true;
			} else
			{
			    return false;
			}
		}
	    });
        for(String f:list)
	    {
		System.out.println(f);
	    }
    }
}
