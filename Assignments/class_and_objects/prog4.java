//Assignment third program 4
class marks
{
    int mark1,mark2;
    String subject;
    marks(String sub,int m1,int m2)
    {
	mark1=m1;
	mark2=m2;
	this.subject=sub;
    }
    int avg()
    {
	return ((mark1+mark2)/2);
    }
    void display()
    {
	System.out.println(" "+this.subject+" "+mark1+" "+mark2+"= "+(float)avg());
    }
}
class prog4
{
    public static void main(String args[])
    {
	marks obj=new marks("Marathi",85,75);
	obj.display();
    }   
}
/*
cm@cm:~/cm/sem-4/java/assignment3$ javac Q4_marks.java
cm@cm:~/cm/sem-4/java/assignment3$ java Q4_marks
 Marathi 85 75= 80.0
 */
