import java.util.Scanner;
class palindrom
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter no");
	int n=obj.nextInt();
	int rev=0,temp=n;
	while(n>0)
	    {
		int d=n%10;
		rev=(rev*10)+d;
		n=n/10;
	    }
	if(rev==temp)
	    {
		System.out.println("No is palidrom");
	    }
	else
	    {
		System.out.println("No is not palindrom");
	    }
    }
}
