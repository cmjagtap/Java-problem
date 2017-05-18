/* input 4
   output
   1
   23
   456
   78910
*/
import java.util.Scanner;
class pattern3
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter no");
	int n=obj.nextInt(),k=1;
	for(int i=1;i<=n;i++)
	    {
		for(int j=1;j<=i;j++)
		    {
			System.out.print(k++);
		    }
		System.out.print("\n");
	    }
    }
}
