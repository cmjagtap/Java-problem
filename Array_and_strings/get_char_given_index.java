import java.util.Scanner;
class get_char_given_index
{
    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter String");
	String str=obj.nextLine();
	System.out.println("Enter Index");
	int index=obj.nextInt();
	if(index>str.length())
	    {
		System.out.println("index not in string");
	    }
	else
	    {
		char s1=str.charAt(index);
		System.out.println(s1);
	    }
    }
}
