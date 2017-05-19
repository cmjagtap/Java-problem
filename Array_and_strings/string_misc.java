import java.util.Scanner;
import java.util.Calendar;
class string_misc
{
    static void compare(String str1,String str2)
    {
	int result = str1.compareTo(str2);  //builtin function
	if(result==0)
	    {
		System.out.println("Both string are equal");
	    }
	else if(result<0)
	    {
		System.out.println("String first is less than second");
	    }
	else
	    {
		System.out.println("First string is greter than second");
	    }
    }
    static void equals_m(String str1,String str2)
    {
	System.out.println("str1 equals to str2: "+str1.equals(str2));
    }
    static void content_equals(String str1,String str2)
    {
	System.out.println("str1 content equals to str2: "+str1.contentEquals(str2));
    }
    static void convert_string_to_array(String str1)
    {
	char[] array= str1.toCharArray();
	System.out.println("Content of Array:");
	for(char c: array)
	    {
		System.out.println(c);
	    }
    }
    static void get_time()
    {
	Calendar c = Calendar.getInstance();
	System.out.println("Current Date and Time :"); 
	System.out.format("%tB %te, %tY%n", c, c, c);
	System.out.format("%tl:%tM %tp%n", c, c, c); 
    }
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter first String");
	String str1=obj.nextLine();
	System.out.println("enter second String");
	String str2=obj.nextLine();
	System.out.println("Length of first string is "+str1.length());
	compare(str1,str2);
	equals_m(str1,str2);
	content_equals(str1,str2);
	convert_string_to_array(str1);
	get_time();
    }
}
