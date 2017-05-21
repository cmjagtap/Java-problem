// Assignment first program second
class prog2
{
    public static void main(String args[])
    {
	int n=Integer.parseInt(args[0]);
	int m=Integer.parseInt(args[1]);
	boolean x=(n%7==0 && m%7==0);
	System.out.println(x);
	    
    }
}
/*
cm@cm:~/cm/sem-4/java/assignment$ java prog2 14 14
false
cm@cm:~/cm/sem-4/java/assignment$ java prog2 14 14
true
cm@cm:~/cm/sem-4/java/assignment$ 
*/
