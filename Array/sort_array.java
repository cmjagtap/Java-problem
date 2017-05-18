import java.util.Arrays;
class sort_array
{
    public static void main(String args[])
    {
	int [] array={7,3,4,2,5,8};
	System.out.println("Array before sort "+Arrays.toString(array));
	Arrays.sort(array);
	System.out.println("Array After sort "+Arrays.toString(array));
    }
}
