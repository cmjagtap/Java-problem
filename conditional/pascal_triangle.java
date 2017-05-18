import java.util.Scanner;
public class pascal_triangle
{
    public static void main(String[] args)
    {
	int no_row,c=1,blk,i,j;
	System.out.print("Enter number of rows: ");
	Scanner obj = new Scanner(System.in);
	no_row = obj.nextInt();
	for(i=0;i<no_row;i++)
	    {
		for(blk=1;blk<=no_row-i;blk++)
		    {
			System.out.print(" ");
		    }
		for(j=0;j<=i;j++)
		    {
			if (j==0||i==0)
			    c=1;
			else
			    c=c*(i-j+1)/j;
			System.out.print(" "+c);
		    }
		System.out.print("\n");
	    }
    }
}
