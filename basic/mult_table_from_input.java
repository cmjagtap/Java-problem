import java.util.Scanner;
class mult_table_from_input
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	int n;
	System.out.println("Enter no to print table");
	n=obj.nextInt();
	for(int i=1;i<=10;i++)
	    {
		System.out.println(n + " * "+ i+ " =  " +i*n);
	    }
	
    }
}
