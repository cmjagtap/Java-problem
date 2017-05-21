//Assignment first prog first
class prog1
{
    public static void main(String args[])
    {
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	int z=Integer.parseInt(args[2]);
	Boolean b=(((x > y) && (y > z)) || ((x<y) && (y<z)));;
	System.out.println(b);
    }
}
/*
cm@cm:~/cm/sem-4/java/assignment$ javac prog1.java
cm@cm:~/cm/sem-4/java/assignment$ java prog1 1 2 3
true
cm@cm:~/cm/sem-4/java/assignment$ java prog1 3 1 2
false
*/
