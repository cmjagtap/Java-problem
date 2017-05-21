class prog3
{
    public static void main(String args[])
    {
	try
	    {
	    	int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int add=n1+n2;
		System.out.println("Sum is "+add);
	    }
	catch(Exception e)
	    {
		System.out.println("Exception as follows");
		e.printStackTrace();
	    }
    }
}
