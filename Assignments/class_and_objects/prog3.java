//Assignment third program 3
class demo
{
    void fun()
    {
	System.out.println("Rose is beautiful flower");
    }
    void fun(String str)
    {
	System.out.println("Sunflower is beautiful flower");
	System.out.println("Sunflower is beautiful flower");
    }
    void fun(String str,int n)
    {
	for(int i=0;i<n;i++)
	    {
		System.out.println("Marigold is beautiful flower");
	    }
    }
}
class prog3
{
    public static void main(String args[])
    {
	demo obj=new demo();
	System.out.println("First Method");
	obj.fun();
	System.out.println("Second Method");
	obj.fun("String");
	System.out.println("Third Method");
	obj.fun("String",5);
    }
}
/*
cm@cm:~/cm/sem-4/java/assignment3$ java Q3_ass3
First Method
Rose is beautiful flower
Second Method
Sunflower is beautiful flower
Sunflower is beautiful flower
Third Method
Marigold is beautiful flower
Marigold is beautiful flower
Marigold is beautiful flower
Marigold is beautiful flower
Marigold is beautiful flower
 */
