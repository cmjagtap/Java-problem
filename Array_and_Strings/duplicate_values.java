import java.util.Arrays;
import java.util.Scanner;
public class duplicate_values
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
	for(int i=0;i<array.length-1;i++)
	    {
		for(int j=i+1;j<array.length;j++)
		    {
			if((array[i] == array[j]) && (i != j))
			    {
				System.out.println("Duplicate Element : "+array[j]);
			    }
		    }
	    }
    }    
}
