// Assignment first program no 3
class prog3
{
    public static void main(String args[])
    {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);
	double s=(a+b+c)/2;
	double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("Area of tringle is "+area);
    }
}
/*
cm@cm:~/cm/sem-4/java/assignment$ java prog3 2 2 2
Area of tringle is 1.7320508075688772
*/
