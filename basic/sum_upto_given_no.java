import java.util.Scanner;
class sum_upto_given_no
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter no");
	int n=obj.nextInt();
	int sum=0;
	for(int i=0;i<=n;i++)
	    {
		sum+=i;
	    }
	System.out.println("Sum upto "+n +" is "+sum);
    }
}
    
