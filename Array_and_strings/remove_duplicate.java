cm@fsociety:~/Desktop/java/conditional$ ls
chek_no_is_pos_neg.java
count_no_of_digit.class
count_no_of_digit.java
count_no_of_digit.java~
is_leap_year.java
max_from_three.java
no_of_day_in_month.java
pascal_triangle.java
pattern1.java
pattern2.java
pattern3.java
quadratic_equation.java
cm@fsociety:~/Desktop/java/conditional$ cd ..
cm@fsociety:~/Desktop/java$ cd Array_and_Strings/
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac sort_array.java
sort_array.java:5: error: ';' expected
	int array={7,3,4,2,5,8}
	                       ^
sort_array.java:6: error: bad initializer for for-loop
	for(s:array)
	    ^
2 errors
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac sort_array.java
sort_array.java:5: error: illegal initializer for int
	int array={7,3,4,2,5,8};
	          ^
sort_array.java:6: error: for-each not applicable to expression type
	for(int s:array)
	          ^
  required: array or java.lang.Iterable
  found:    int
2 errors
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac sort_array.java
sort_array.java:5: error: illegal initializer for int
	int array={7,3,4,2,5,8};
	          ^
sort_array.java:6: error: for-each not applicable to expression type
	for(int s : array)
	            ^
  required: array or java.lang.Iterable
  found:    int
2 errors
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java sort_array
7
3
4
2
5
8
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java sort_array
Array before sort
7
3
4
2
5
8
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac sort_array.java
sort_array.java:11: error: cannot find symbol
	array.sort();
	     ^
  symbol:   method sort()
  location: variable array of type int[]
1 error
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac sort_array.java
sort_array.java:11: error: cannot find symbol
	Arrays.sort(array);
	^
  symbol:   variable Arrays
  location: class sort_array
1 error
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java sort_array
Array before sort
7
3
4
2
5
8
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java sort_array
Array before sort
7
3
4
2
5
8
Array After sort
2
3
4
5
7
8
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac get_index.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java get_index
Index position of 25 is: 0
Index position of 77 is: 6
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac get_index.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java get_index
Index position of 25 is: -1
Index position of 77 is: 6
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac get_index.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java get_index
Index position of 25 is: 0
Index position of 77 is: 6
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac remove_element.java
remove_element.java:7: error: cannot find symbol
	System.out.println("Original Array : "+Arrays.toString(my_array));     	int removeIndex = 1;
	                                       ^
  symbol:   variable Arrays
  location: class remove_element
remove_element.java:13: error: cannot find symbol
	System.out.println("After removing the second element: "+Arrays.toString(my_array));
	                                                         ^
  symbol:   variable Arrays
  location: class remove_element
2 errors
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac remove_element.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java remove_element
Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
After removing the second element: [25, 56, 15, 36, 56, 77, 18, 29, 49, 49]
cm@fsociety:~/Desktop/java/Array_and_Strings$ cat remove_element.java
import java.util.Arrays; 
class remove_element
{
    public static void main(String args[])
    {
	int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	System.out.println("Original Array : "+Arrays.toString(my_array));     	int removeIndex = 1;

	for(int i = removeIndex; i < my_array.length -1; i++)
	    {
		my_array[i] = my_array[i + 1];
	    }
	System.out.println("After removing the second element: "+Arrays.toString(my_array));
    }
}
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java sort_array
Array before sort
7
3
4
2
5
8
Array After sort[2, 3, 4, 5, 7, 8]
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac sort_array.java
sort_array.java:7: error: bad operand type String for unary operator '+++'
	System.out.println("Array before sort ",+Arrays.toString(array));
	                                        ^
1 error
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java sort_array
Array before sort [7, 3, 4, 2, 5, 8]
Array After sort [2, 3, 4, 5, 7, 8]
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac copy_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac copy_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java copy_array
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
	at copy_array.main(copy_array.java:10)
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac copy_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java copy_array
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
	at copy_array.main(copy_array.java:10)
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac copy_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java copy_array
Array one is [1, 3, 5, 2, 6, 8, 9]
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac copy_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java copy_array
Array one is [1, 3, 5, 2, 6, 8, 9]
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac copy_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java copy_array
Array one is [1, 3, 5, 2, 6, 8, 9]
Array one is [1, 3, 5, 2, 6, 8, 9, 0, 0, 0]
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac insert_element.java
insert_element.java:15: error: cannot find symbol
		my_array[i] = my_array[i-1];
		^
  symbol:   variable my_array
  location: class insert_element
insert_element.java:15: error: cannot find symbol
		my_array[i] = my_array[i-1];
		              ^
  symbol:   variable my_array
  location: class insert_element
2 errors
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac insert_element.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java insert_element
Enter a no to insert into array and position
5
2
Orignal Array is [1, 3, 5, 2, 6, 8, 9]
Array is [1, 3, 5, 5, 2, 6, 8]
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac insert_element.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java insert_element
Enter a no to insert into array and position
55
2
Orignal Array is [1, 3, 5, 2, 6, 8, 9]
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7
	at insert_element.main(insert_element.java:15)
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac insert_element.java
insert_element.java:18: error: cannot find symbol
        pos = s.nextInt();
              ^
  symbol:   variable s
  location: class insert_element
insert_element.java:19: error: cannot find symbol
	x = s.nextInt();
	    ^
  symbol:   variable s
  location: class insert_element
2 errors
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac insert_element.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java insert_element
Enter no. of elements you want in array:5
Enter all the elements:
1
2
3
4
5
Enter the position and elemnet:55 3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 54
	at insert_element.main(insert_element.java:24)
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac insert_element.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java insert_element
Enter no. of elements you want in array:4
Enter all the elements:
1
2
3
4
Enter the position and elemnet:44
2
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 43
	at insert_element.main(insert_element.java:24)
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac insert_element.java
insert_element.java:41: error: unclosed comment
	/*
	^
insert_element.java:64: error: reached end of file while parsing
2 errors
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac insert_element.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java insert_element
Enter Array Size : 4
Enter Array Elements : 1
2
3
4
Enter Element to be Insert : 55
At Which Position ? (Enter Index Number ) : 2
Element inserted Successfully..!!
Now the New Array is :
1 2 55 3 4 cm@fsociety:~/Desktop/java/Array_and_Strings$ javac insert_element.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java insert_element
Enter Array Size : 4
Enter Array Elements : 1
2
3
4
Enter Element to be Insert ad position : 33
2
Element inserted Successfully..!!
Now the New Array is :
[1, 2, 33, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]cm@fsociety:~/Desktop/java/Array_and_Strings$ javac insert_element.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java insert_element
Enter Array Size : 4
Enter Array Elements : 1
2
3
4
Enter Element to be Insert ad position : 22
2
Element inserted Successfully..!!
Now the New Array is :
1 2 22 3 4 cm@fsociety:~/Desktop/java/Array_and_Strings$ javac insert_element.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java insert_element
Enter Array Size : 4
Enter Array Elements : 1
2
3
4
Enter Element to be Insert ad position : 22
2
Element inserted Successfully..!!
Now the New Array is :
1 
2 
22 
3 
4 
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac insert_element.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java insert_element
Enter Array Size : 4
Enter Array Elements : 1
2
3
4
Enter Element to be Insert ad position : 22
2
Element inserted Successfully..!!
Now the New Array is :
1
2
22
3
4
cm@fsociety:~/Desktop/java/Array_and_Strings$ cat insert_element.java
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
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac Max_Min.java
Max_Min.java:7: error: cannot find symbol
	System.out.prinltn("Enter size of Array");
	          ^
  symbol:   method prinltn(String)
  location: variable out of type PrintStream
Max_Min.java:10: error: cannot find symbol
	System.out.prinltn("Enter Array elemnts");
	          ^
  symbol:   method prinltn(String)
  location: variable out of type PrintStream
2 errors
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac Max_Min.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min
Enter size of Array
4
Enter Array elemnts
1
2
3
4
cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min
Enter size of Array
0
Enter Array elemnts
cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min
Enter size of Array
0
Enter Array elemnts
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac Max_Min.java
Max_Min.java:24: error: illegal start of statement
    }
    ^
1 error
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac Max_Min.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min
Enter size of Array
0
cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min
Enter size of Array
1
Enter Array elemnts
1
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac Max_Min.java
Max_Min.java:23: error: variable max might not have been initialized
	System.out.println("Max is " +max +" Min is "+min);
	                              ^
Max_Min.java:23: error: variable min might not have been initialized
	System.out.println("Max is " +max +" Min is "+min);
	                                              ^
2 errors
cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min
Enter size of Array
javac Max_Min.java
Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextInt(Scanner.java:2117)
	at java.util.Scanner.nextInt(Scanner.java:2076)
	at Max_Min.main(Max_Min.java:8)
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac Max_Min.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min

Enter size of Array
1
Enter Array elemnts
1
Max is 1 Min is 1
cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min
Enter size of Array
1
Enter Array elemnts
55
Max is 55 Min is 55
cm@fsociety:~/Desktop/java/Array_and_Strings$ 
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac Max_Min.java

cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min
Enter size of Array
1
Enter Array elemnts
1
Max is 1 Min is 1
cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min
Enter size of Array
2
Enter Array elemnts
1
2
Max is 2 Min is 1
cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min
Enter size of Array
2
Enter Array elemnts
2
1
Max is 2 Min is 1
cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min
Enter size of Array
3
Enter Array elemnts
1
2
3
Max is 3 Min is 1
cm@fsociety:~/Desktop/java/Array_and_Strings$ java Max_Min
Enter size of Array
5
Enter Array elemnts
55
22
1
5
77
Max is 77 Min is 1
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac reverse_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_array
Enter size of Array
5
1
23
2
4
5
After sort[1, 2, 4, 5, 23]
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac reverse_array.java
reverse_array.java:16: error: cannot find symbol
	Arrays.sort(array, Collections.reverseOrder());
	                   ^
  symbol:   variable Collections
  location: class reverse_array
1 error
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac reverse_array.java
reverse_array.java:3: error: package java.collections does not exist
import java.collections.list;
                       ^
1 error
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac reverse_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_array
Enter size of Array
5
1
2
3
4
5
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	at reverse_array.main(reverse_array.java:18)
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac reverse_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_array
Enter size of Array
3
1
2
3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at reverse_array.main(reverse_array.java:18)
cm@fsociety:~/Desktop/java/Array_and_Strings$ 4
bash: 4: command not found
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac reverse_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_array
Enter size of Array
3
1
2
3
After sort[3, 2, 1]
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_array
Enter size of Array
1
1
After sort[1]
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_array
Enter size of Array
2
2
1
After sort[1, 2]
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_arr4ay
Enter size of Array
2
1
2
After sort[2, 1]
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_arr4ay
Error: Could not find or load main class reverse_arr4ay
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_arr4ay
Error: Could not find or load main class reverse_arr4ay
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_array
Enter size of Array
5
1
2
3
4
5
After sort[5, 4, 3, 2, 1]
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_array
Enter size of Array
5
5
4
3
2
1
After sort[1, 2, 3, 4, 5]
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac reverse_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_array
Enter size of Array
4
1
2
3
4
After sort[4, 3, 2, 1]
cm@fsociety:~/Desktop/java/Array_and_Strings$ java reverse_array
Enter size of Array
4
4
3
2
1
After sort[4, 3, 2, 1]
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac duplicate_values.java
duplicate_values.java:19: error: cannot find symbol
			if((array[i] == my_array[j]) && (i != j))
			                ^
  symbol:   variable my_array
  location: class duplicate_values
1 error
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac duplicate_values.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java duplicate_values
Enter size of Array
5
1
2
3
4
5
cm@fsociety:~/Desktop/java/Array_and_Strings$ java duplicate_values
Enter size of Array
5
1
2
3
2
4
Duplicate Element : 2
cm@fsociety:~/Desktop/java/Array_and_Strings$ java duplicate_values
Enter size of Array
5
1
1
2
3
4
Duplicate Element : 1
cm@fsociety:~/Desktop/java/Array_and_Strings$ java duplicate_values
Enter size of Array
5
1
1
2
3
2
Duplicate Element : 1
Duplicate Element : 2
cm@fsociety:~/Desktop/java/Array_and_Strings$ ls
copy_array.class
copy_array.java
copy_array.java~
duplicate_values.class
duplicate_values.java
duplicate_values.java~
get_index.class
get_index.java
get_index.java~
insert_element.class
insert_element.java
insert_element.java~
Max_Min.class
Max_Min.java
Max_Min.java~
remove_element.class
remove_element.java
remove_element.java~
reverse_array.class
reverse_array.java
reverse_array.java~
sort_array.class
sort_array.java
sort_array.java~
cm@fsociety:~/Desktop/java/Array_and_Strings$ rm *.class
cm@fsociety:~/Desktop/java/Array_and_Strings$ rm *~
cm@fsociety:~/Desktop/java/Array_and_Strings$ ls
copy_array.java
duplicate_values.java
get_index.java
insert_element.java
Max_Min.java
remove_element.java
reverse_array.java
sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ ls
copy_array.java
duplicate_values.java
get_index.java
insert_element.java
Max_Min.java
remove_element.java
reverse_array.java
sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac common_ele_two_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java common_ele_two_array
Enter array size
5
Enter Array elemnt of frst array
1
2
3
4
5
Enter Array elemnt of second array
1
2
3
4
5
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac common_ele_two_array.java
common_ele_two_array.java:10: error: array required, but int found
			if(array1[i]==array2[j])
			                    ^
common_ele_two_array.java:35: error: incompatible types: int[] cannot be converted to int
	common_elements(array1,array2,size);
	                       ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
2 errors
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac common_ele_two_array.java
common_ele_two_array.java:35: error: non-static method common_elements(int[],int[],int) cannot be referenced from a static context
	common_elements(array1,array2,size);
	^
1 error
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac common_ele_two_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java common_ele_two_array
Enter array size
4
Enter Array elemnt of frst array
1
2
3
4
Enter Array elemnt of second array
4
1
2
3
Common elemnts
1
2
3
cm@fsociety:~/Desktop/java/Array_and_Strings$ 4
bash: 4: command not found
cm@fsociety:~/Desktop/java/Array_and_Stringsjava common_ele_two_array
Enter array size
4
Enter Array elemnt of frst array
1
2
3
4
Enter Array elemnt of second array
5
6
7
8
Common elemnts
cm@fsociety:~/Desktop/java/Array_and_Strings$ java common_ele_two_array
Enter array size
4
Enter Array elemnt of frst array
1
2
3
4
Enter Array elemnt of second array
2
5
6
7
Common elemnts
cm@fsociety:~/Desktop/java/Array_and_Strings$ java common_ele_two_array
Enter array size
1
Enter Array elemnt of frst array
1
Enter Array elemnt of second array
1
Common elemnts
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac common_ele_two_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java common_ele_two_array
Enter array size
4
Enter Array elemnt of frst array
1
2
3
4
Enter Array elemnt of second array
1
2
3
4
Common elemnts
1
2
3
4
cm@fsociety:~/Desktop/java/Array_and_Strings$ java common_ele_two_array
Enter array size
4
Enter Array elemnt of frst array
1
2
3
4
Enter Array elemnt of second array
5
6
7
8
Common elemnts
cm@fsociety:~/Desktop/java/Array_and_Strings$ java common_ele_two_array
Enter array size
4
Enter Array elemnt of frst array
1

3
4
5
Enter Array elemnt of second array
3
5
6
7
Common elemnts
3
5
cm@fsociety:~/Desktop/java/Array_and_Strings$ rm remove_duplicate.java 
cm@fsociety:~/Desktop/java/Array_and_Strings$ ls
common_ele_two_array.class
common_ele_two_array.java
copy_array.java
duplicate_values.java
get_index.java
insert_element.java
Max_Min.java
remove_element.java
reverse_array.java
sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ ls
common_ele_two_array.class
common_ele_two_array.java
copy_array.java
duplicate_values.java
get_index.java
insert_element.java
Max_Min.java
remove_element.java
reverse_array.java
sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ rm *.class
cm@fsociety:~/Desktop/java/Array_and_Strings$ ls
common_ele_two_array.java
copy_array.java
duplicate_values.java
get_index.java
insert_element.java
Max_Min.java
remove_element.java
reverse_array.java
sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac remove_duplicates.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java remove_duplicates
Original Array : 
0	3	-2	4	3	2	
Array with unique values : 
0	3	-2	4	2	
---------------------------
Original Array : 
10	22	10	20	11	22	
Array with unique values : 
10	22	11	20	
---------------------------
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac remove_duplicates.java
remove_duplicates.java:6: error: cannot find symbol
        System.out.println("Original Array : "+Array.toString(my_array));
                                               ^
  symbol:   variable Array
  location: class remove_duplicates
1 error
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac remove_duplicates.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java remove_duplicates
Original Array : [0, 3, -2, 4, 3, 2]
0	3	-2	4	3	2	
Array with unique values : 
0	3	-2	4	2	
---------------------------
Original Array : [10, 22, 10, 20, 11, 22]
10	22	10	20	11	22	
Array with unique values : 
10	22	11	20	
---------------------------
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac remove_duplicates.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java remove_duplicates
Original Array : [0, 3, -2, 4, 3, 2]

Array with unique values : [0, 3, -2, 4, 2]
---------------------------
Original Array : [10, 22, 10, 20, 11, 22]

Array with unique values : [10, 22, 11, 20]
---------------------------
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac remove_duplicates.java
remove_duplicates.java:20: error: cannot find symbol
	int[] array1 = Arrays.copyOf(my_array, no_unique_elements);     
	                                       ^
  symbol:   variable no_unique_elements
  location: class remove_duplicates
1 error
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac remove_duplicates.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java remove_duplicates
Original Array : [0, 3, -2, 4, 3, 2]

Array with unique values : [0, 3, -2, 4, 2]
---------------------------
Original Array : [10, 22, 10, 20, 11, 22]

Array with unique values : [10, 22, 11, 20]
---------------------------
cm@fsociety:~/Desktop/java/Array_and_Strings$ ls
common_ele_two_array.java
copy_array.java
duplicate_values.java
get_index.java
insert_element.java
Max_Min.java
#remove_duplicate.java#
remove_duplicates.class
remove_duplicates.java
remove_duplicates.java~
remove_element.java
reverse_array.java
sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ 
cm@fsociety:~/Desktop/java/Array_and_Strings$ ls
common_ele_two_array.java
copy_array.java
duplicate_values.java
get_index.java
insert_element.java
Max_Min.java
#remove_duplicate.java#
remove_duplicates.class
remove_duplicates.java
remove_duplicates.java~
remove_element.java
reverse_array.java
sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac add_2_matrices.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java add_2_matrices
Enter number of rows of matrix
3
Enter number of columns of matrix
3
Enter elements of first matrix
1 2 3
2 3 4
5 6 7
Enter the elements of second matrix
7 6 5
4 3 2
3 2 1
Sum of the matrices:-
8	8	8	
6	6	6	
8	8	8	
cm@fsociety:~/Desktop/java/Array_and_Strings$ java add_2_matrices
Enter number of rows of matrix
1 2 3
Enter number of columns of matrix
Enter elements of first matrix
  C-c C-ccm@fsociety:~/Desktop/java/Array_and_Strings$ java add_2_matrices
Enter number of rows of matrix
3
Enter number of columns of matrix
3
Enter elements of first matrix
1 2 3
4 5 6
7 8 9
Enter the elements of second matrix
9 8 7
6 5 4
3 2 1
Sum of the matrices:-
10	10	10	
10	10	10	
10	10	10	
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac arrays_to_ArrayList.java 
Note: arrays_to_ArrayList.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac arrays_to_ArrayList.java 
Note: arrays_to_ArrayList.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
cm@fsociety:~/Desktop/java/Array_and_Strings$ rm arrays_to_ArrayList.class
cm@fsociety:~/Desktop/java/Array_and_Strings$ rm arrays_to_ArrayList.class
cm@fsociety:~/Desktop/java/Array_and_Strings$ ls
add_2_matrices.java
array_to_arraylist.java
common_ele_two_array.java
copy_array.java
duplicate_values.java
get_index.java
insert_element.java
Max_Min.java
#remove_duplicate.java#
remove_duplicates.java
remove_element.java
reverse_array.java
sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ cat array_to_arraylist.java 
import java.util.ArrayList;
import java.util.Arrays;
class arrays_to_ArrayList
{
    public static void  main(String[] args) 
    {
	String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
	ArrayList  list = new ArrayList(Arrays.asList(my_array));
	System.out.println(list);
    }
}
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac -Xlint array_to_arraylist.java
Note: array_to_arraylist.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac -Xlint:unchecked array_to_arraylist.java
array_to_arraylist.java:8: warning: [rawtypes] found raw type: ArrayList
	ArrayList  list = new ArrayList(Arrays.asList(my_array));
	^
  missing type arguments for generic class ArrayList<E>
  where E is a type-variable:
    E extends Object declared in class ArrayList
array_to_arraylist.java:8: warning: [rawtypes] found raw type: ArrayList
	ArrayList  list = new ArrayList(Arrays.asList(my_array));
	                      ^
  missing type arguments for generic class ArrayList<E>
  where E is a type-variable:
    E extends Object declared in class ArrayList
array_to_arraylist.java:8: warning: [unchecked] unchecked call to ArrayList(Collection<? extends E>) as a member of the raw type ArrayList
	ArrayList  list = new ArrayList(Arrays.asList(my_array));
	                  ^
  where E is a type-variable:
    E extends Object declared in class ArrayList
3 warnings
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac -Xlint:unchecked array_to_arraylist.java
array_to_arraylist.java:8: warning: [unchecked] unchecked call to ArrayList(Collection<? extends E>) as a member of the raw type ArrayList
	ArrayList  list = new ArrayList(Arrays.asList(my_array));
	                  ^
  where E is a type-variable:
    E extends Object declared in class ArrayList
1 warning
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac array_to_arraylist.java
Note: array_to_arraylist.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac array_to_arraylist.java
Note: array_to_arraylist.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
cm@fsociety:~/Desktop/java/Array_and_Strings$ rm array_to_arraylist.*
rm: cannot remove 'array_to_arraylist.': No such file or directory
cm@fsociety:~/Desktop/java/Array_and_Strings$ rm array_to_arraylist.*
cm@fsociety:~/Desktop/java/Array_and_Strings$ ls
add_2_matrices.java
common_ele_two_array.java
copy_array.java
duplicate_values.java
get_index.java
insert_element.java
Max_Min.java
#remove_duplicate.java#
remove_duplicates.java
remove_element.java
reverse_array.java
sort_array.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ ls
add_2_matrices.java
common_ele_two_array.java
copy_array.java
duplicate_values.java
get_index.java
insert_element.java
Max_Min.java
#remove_duplicate.java#
remove_duplicates.java
remove_element.java
reverse_array.java
sort_array.java
two_array_equality.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac two_array_equality.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java two_array_equality
Two arrays are not equal.
Two arrays are equal.
cm@fsociety:~/Desktop/java/Array_and_Strings$ javac two_array_equality.java
cm@fsociety:~/Desktop/java/Array_and_Strings$ java two_array_equality
Two arrays are not equal.
Two arrays are equal.
cm@fsociety:~/Desktop/java/Array_and_Strings$ 