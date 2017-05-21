//Assignment second program 1
class prog1
{
    public static void main(String args[])
    {
	int mark=Integer.parseInt(args[0]);
	if(mark>90)
	    {
		System.out.println("Grade A");
	    }
	else if(mark >80 && mark<90)
	    {
		System.out.println("Grade B");
	    }
	else if(mark >70 && mark <80)
	    {
		System.out.println("Grade C");
	    }
	else if(mark >60 && mark <70)
	    {
		System.out.println("Grade D");
	    }
	else
	    {
		System.out.println("Grade F");
	    }
    }
}
/*
cm@cm:~/cm/sem-4/java/assignment2$ javac prog1.java
cm@cm:~/cm/sem-4/java/assignment2$ java prog1 76
Grade C
 */
