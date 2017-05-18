import java.util.Scanner;
class common_ele_two_array
{
    static void common_elements(int array1[],int array2[],int size)
    {
	for(int i=0;i<size;i++)
	    {
		for(int j=0;j<size;j++)
		    {
			if(array1[i]==array2[j])
			    {
				System.out.println(array1[i]);
			    }
		    }
	    }
    }
    public static void main(String args[])
    {
	Scanner obj=new  Scanner(System.in);
	System.out.println("Enter array size");
	int size=obj.nextInt();
	int array1[]=new int[size];
	int array2[]=new int[size];
	System.out.println("Enter Array elemnt of frst array");
	for(int i=0;i<size;i++)
	    {
		array1[i]=obj.nextInt();
	    }
	System.out.println("Enter Array elemnt of second array");
	for(int i=0;i<size;i++)
	    {
		array2[i]=obj.nextInt();
	    }
	System.out.println("Common elemnts");
	common_elements(array1,array2,size);
    }
}
