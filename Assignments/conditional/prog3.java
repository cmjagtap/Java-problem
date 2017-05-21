//Assignment second program 3
class prog3
{
    public static void main(String args[])
    {
	int n=Integer.parseInt(args[0]);
	int a=Integer.parseInt(args[1]);
	for (int i=1; i <= a ; i++ )
	    {
		System.out.println(n+"*"+i+" = "+(n*i));
	    }
    }
}
/*cm@cm:~/cm/sem-4/java/assignment2$ java prog3 25 5
  25*1 = 25
  25*2 = 50
  25*3 = 75
  25*4 = 100
  25*5 = 125
*/
