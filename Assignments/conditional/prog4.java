class prog4
{
    public static void main(String args[])
    {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);
	
	if((a<=0) || (b<=0) || (c<=0))
	    {
		System.out.println("This is not a triangle.\n");
	    }
	else
	    {
		if((a + b <= c || (a + c <= b) || (b + c <= a)))
		    {
			System.out.println("This is not a triangle.\n");
		    }
		else
		    {
			int max = c;
			if (max < a)
			    {
				c = max;
				max = a;
				a = c;
			    }
			if (max < b)
			    {
				c = max;
				max = b;
				b = c;
			    }

			if( a * a + b * b == max * max )
			    {
				System.out.println("This is a right-angled triangle.\n");
			    }
			else if( a * a +b  * b > max * max)
			    {
				System.out.println("This is an acute-angled triangle.\n");
			    }
			else
			    System.out.println("This is an obtuse-angled triangle.\n");
		    }
	    }
	
	
    }
}
