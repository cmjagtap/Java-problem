import java.util.Scanner;
class max_from_three
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter three nos");
	int x=obj.nextInt();
	int y=obj.nextInt();
	int z=obj.nextInt();
	if(x>y && x >z)
	    {
		System.out.println(" maximum no is  " +x);
	    }
	else if(y>x &&  y>z)
	    {
		System.out.println("Maximum no is " +y);
	    }
	else
	    {
		System.out.println("Maximum no is " +z);
	    }
    }
}
