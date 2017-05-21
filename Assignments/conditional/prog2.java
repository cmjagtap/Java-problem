//Assignment second program 2
class prog2
{
    public static void main(String args[])
    {
	int sum=0;
	int n=Integer.parseInt(args[0]);
	while(n!=0)
	    {
		int digit=n%10;
		sum=sum+digit;
		n=n/10;
	    }
	System.out.println("Sum of Digit is "+sum);
    }
}
/*
cm@cm:~/cm/sem-4/java/assignment2$ java prog2 125
Sum of Digit is 8
*/
