import java.util.Scanner;
// Armstrong no is three digits integer such that the sum of the cubes of its digits is equal to the number itself
class armstrong_no
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter no");
	int n=obj.nextInt();
	int sum=0,no=n,flag=0;
	while(n!=0)
	    {
		int d=n%10;
		sum=sum+d*d*d;
		n=n/10;
	    }
	if(sum==no)
	    {
		System.out.println("No is Armstrong number");
	    }
	else
	    {
		System.out.println("No is not armstrong");
	    }
    }
}
