import java.util.Arrays;
class remove_duplicates
{
    static void unique_array(int[] my_array)
    {
        System.out.println("Original Array : "+Arrays.toString(my_array));
	int size = my_array.length;
	for (int i = 0; i < size; i++) 
        {
            for (int j = i+1; j < size; j++)
		{
		    if(my_array[i] == my_array[j])
			{
			    my_array[j] = my_array[size-1];		    
			    size--;
			    j--;
			}
		}
        }
	int[] array1 = Arrays.copyOf(my_array, size);     
        System.out.println();
	System.out.println("Array with unique values : "+Arrays.toString(array1));      
        System.out.println("---------------------------");
    }
    public static void main(String[] args) 
    {        
        unique_array(new int[] {0, 3, -2, 4, 3, 2});
	unique_array(new int[] {10, 22, 10, 20, 11, 22});
	
    }    
}
