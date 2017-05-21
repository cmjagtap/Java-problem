package info;
import dataobject.Human;

public class prog5 extends Human
{
    prog5(String nm,String fd)
    {
	super(nm,fd);
    }
    public static void main(String args[])
    {
	Treat hm=new Treat("CM","Banana");
	System.out.println("name="+hm.name);
	System.out.println("favoritefood="+hm.favoratefood);
    }
	
}
/*cm@cm:~/cm/sem-4/java/assignment5$ javac -d ./ ./prog5.java 
cm@cm:~/cm/sem-4/java/assignment5$ java info.prog5
name=CM
favoritefood=Banana
*/
