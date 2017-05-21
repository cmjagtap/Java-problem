import java.io.*;
class MarkOutOfBound extends Exception
{
}
class prog2
{
    
    public static void main(String args[])
    {
	int m=Integer.parseInt(args[0]);
	try
	    {
		if(m>100)
		    throw new MarkOutOfBound();
		System.out.println("Your Marks:"+m);
		
		}
	catch(MarkOutOfBound e)
	    {
		System.out.println("Invalid marks");
	    }
    }
}
