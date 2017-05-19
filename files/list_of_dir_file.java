//Enter path for listing directory and files
import java.io.File;
class list_of_dir_file
{
    public static void main(String a[])
    {
        File file = new File("/etc/");
        String[] fileList = file.list();
        for(String name:fileList)
	    {
		System.out.println(name);
	    }
    }
}
/*
cm@fsociety:~/Desktop/java/files$ javac list_of_dir_file.java 
cm@fsociety:~/Desktop/java/files$ java list_of_dir_file
ds
c
*/
