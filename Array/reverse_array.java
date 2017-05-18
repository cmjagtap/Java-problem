import java.util.Scanner;
import java.util.Arrays;
class reverse_array
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter size of Array");
	int size=obj.nextInt();
	int array[]=new int[size];
	for(int i=0;i<size;i++)
	    {
		array[i]=obj.nextInt();
	    }
	for(int i=0;i<size;i++) 
	    {
		for(int j=i+1;j<size;j++) 
		    {
			if(array[i] < array[j]) 
			    {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			    }
		    }
	    }
	System.out.println("After sort"+Arrays.toString(array));
    }
}
