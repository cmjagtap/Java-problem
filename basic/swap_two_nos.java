import java.util.Scanner;
class swap_two_nos
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter two nos");
	int a=obj.nextInt();
	int b=obj.nextInt();
	System.out.println("Before swapping no A " +a);
	System.out.println("Before swapping no B " +b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping no A " +a);
	System.out.println("After swapping no B " +b);

    }
}
