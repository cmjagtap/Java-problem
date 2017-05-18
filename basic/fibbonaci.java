import java.util.Scanner;
class fibbonaci
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter no");
	int no=obj.nextInt();
	int f1=0,f2=1,i=2,f3;
	System.out.println(+f1+f2);
	while(i<=no)
	    {
		f3=f1+f2;
		i++;
		System.out.println(+f3);
		f1=f2;
		f2=f3;
	    }
    }
}
