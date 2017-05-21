//Assignment second program 6
class prog6
{
    public static void main(String args[])
    {
	int line=Integer.parseInt(args[0]);
	for(int i=0;i<line;i++)
	    {
		for(int k=line; k>i; k--)
		    {
			System.out.print(" ");
		    }
		int number = 1;
		for(int j=0;j<=i;j++)
		    {
			System.out.print(number+ " ");
			number = number * (i - j) / (j + 1);
		    }
		System.out.println();
	    }
    }
}
/*cm@cm:~/cm/sem-4/java/assignment2$ javac prog6.java
cm@cm:~/cm/sem-4/java/assignment2$ java prog6 6
      1 
     1 1 
    1 2 1 
   1 3 3 1 
  1 4 6 4 1 
 1 5 10 10 5 1 
 */
