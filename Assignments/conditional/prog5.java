//Assignment second program 5
class prog5
{
    public static void main(String args[])
    {
	int reverse=0;
	int n=Integer.parseInt(args[0]);
	while(n!= 0)
	    {
		reverse= reverse*10 + n % 10;
		n=n/ 10;
	    }
	System.out.println("Reverse no is  "+reverse);
    }
}
/*
cm@cm:~/cm/sem-4/java/assignment2$ javac prog5.java
cm@cm:~/cm/sem-4/java/assignment2$ java prog5 5689
Reverse no is  9865
 */
