import java.util.Arrays;
class copy_array
{
    public static void main(String args[])
    {
	int []array={1,3,5,2,6,8,9};
	int array2[]=new int[10];
	for(int i=0;i<array.length;i++)
	    {
		array2[i]=array[i];
	    }
	System.out.println("Array one is "+Arrays.toString(array));
	System.out.println("Array one is "+Arrays.toString(array2));
    }
}
