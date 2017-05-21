public class prog1
{
    double avrage(String arr[])
    {
	for(int i=0;i<arr.lenth();i++)
	    {
		
	    }
    }
    public static void main(String args[])
    {
	try
	    {
		System.out.println("Try block before error");
		System.out.println(1/0);
		System.out.println("Try block after error");
	    }
	catch(java.lang.ArithmeticException e)
	    {
		System.out.println("Catch block");
		System.out.println("A stack Trace of error");
		e.printStackTrace();
		System.out.println("Operation is not possible");
	    }
	finally
	    {
		System.out.println("Finally block");
	    }
	System.out.println("Demo is over");
    }
}
