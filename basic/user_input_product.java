import java.util.Scanner;
class user_input_product
{
    public static void main(String args[])
    {
	Scanner  obj=new Scanner(System.in);
	int x,y,product;
	System.out.println("Enter two nos");
	x=obj.nextInt();
	y=obj.nextInt();
	product=x*y;
	System.out.println("Product of two nos is " +product);
    }
}
