//chek no is positive or negative
import java.util.Scanner;
class chek_no_is_pos_neg
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter no");
	int n=obj.nextInt();
	if(n>0)
	    {
		System.out.println("Given no is positive");
	    }
	else if(n<0)
	    {
		System.out.println("Given no is Negative");
	    }
	else
	    {
		System.out.println("Given no is zero");
	    }
    }
}
