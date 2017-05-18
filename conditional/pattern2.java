/* input 5
   output
   1
   22
   333
   4444
   55555 */
import java.util.Scanner;
class pattern2
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter no");
	int n=obj.nextInt();
	for(int i=1;i<=n;i++)
	    {
		for(int j=1;j<=i;j++)
		    {
			System.out.print(i);
		    }
		System.out.print("\n");
	    }
    }
}
