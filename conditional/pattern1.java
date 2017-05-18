/* Input number of rows : 10
   Expected Output :
   1
   12
   123
   1234
   12345 */
import java.util.Scanner;
class pattern1
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
			System.out.print(j);
		    }
		System.out.print("\n");
	    }
    }
}
