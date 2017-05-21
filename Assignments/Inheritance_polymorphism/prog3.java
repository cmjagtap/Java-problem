//Assignment four program 3
class car
{  
    void printdesc()
    {
	System.out.println("class car");
    }  
}
class truck extends car
{
    void printdesc()
    {
	System.out.println("Class truck");
    }
}
class Bike extends truck
{  
    void printdesc()
    {
	System.out.println("class bike");
    }
}
class prog3
{
    public static void main(String args[])
    {
	String x=(args[0]);
	if(x.equals("c"))
	    {
		car obj=new car();
		obj.printdesc();
	    }
	else if(x.equals("t"))
	    {
		truck obj1=new truck();
		obj1.printdesc();
	    }
	else if(x.equals("b"))
	    {
		Bike obj = new Bike();
		obj.printdesc();
	    }
    }  
}
