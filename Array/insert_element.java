import java.util.Scanner;
class insert_element
{
    public static void main(String args[])
    {
	int size, insert, i, pos;
	int arr[] = new int[50];
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter Array Size : ");
	size = scan.nextInt();
	System.out.print("Enter Array Elements : ");
	for(i=0; i<size; i++)
	    {
		arr[i] = scan.nextInt();
	    }
	System.out.print("Enter Element to be Insert and position : ");
	insert = scan.nextInt();
	pos = scan.nextInt();
	for(i=size; i>pos; i--)
	    {
		arr[i] = arr[i-1];
	    }
	arr[pos] = insert;
	System.out.print("Element inserted Successfully..!!\n");
	System.out.print("Now the New Array is :\n");
	for(i=0; i<size+1; i++)
	    {
		System.out.println(arr[i]);
	    }
    }
}
