//Assignment third program 2
class car
{
    String color,body;
    car()
    {
	this.color="blue";
	this.body="wagon";
    }
    car(String c,String b)
    {
	this.color=c;
	this.body=b;
    }
    void display()
    {
	if(color == "blue")
	    System.out.println("Car is blue");
	else
	    System.out.println(" "+this.color+" "+this.body);
    }
}
class prog2
{
    public static void main(String args[])
    {
	car obj=new car();
	car obj1=new car("black","blue");
	obj.display();
	obj1.display();
    }   
}
/*
cm@cm:~/cm/sem-4/java/assignment3$ java Q2_car
Car is blue
 black blue
*/

