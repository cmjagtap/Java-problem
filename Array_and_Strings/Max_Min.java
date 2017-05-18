import java.util.Scanner;
class Max_Min
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter size of Array");
	int size=obj.nextInt();
	int array[]=new int[size];
	int max=0,min=0;
	if(size>0)
	System.out.println("Enter Array elemnts");
	for(int i=0;i<size;i++)
	    {
		array[i]=obj.nextInt();
	    }
	if(size==1)
	    {
		max=array[0];
		min=array[0];
	    }
	else
	    {
		max=array[0];
		min=array[0];
		for(int i=1;i<size;i++)
		    {
			if(max<array[i])
			    {
				max=array[i];
			    }
			else if(min>array[i])
			    {
				min=array[i];
			    }
		    }
	    }

	System.out.println("Max is " +max +" Min is "+min);
    }
}
