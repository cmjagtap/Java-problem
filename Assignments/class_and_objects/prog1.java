//Assignment third program 1
class box 
{
    double width;
    double height;
    double depth;
    box(double w, double h, double d) 
    {
	width = w;
	height = h;
	depth = d;
    }
    double volume() 
    {
	return width * height * depth;
    }
}
class prog1
{
    public static void main(String args[])
    {
	box b1 = new box(20, 30, 15);
	box b2 = new box(9, 6, 3);
	double vol;
	vol = b1.volume();
	System.out.println("Volume is " + vol);
	vol = b2.volume();
	System.out.println("Volume is " + vol);
    }
}
/*cm@cm:~/cm/sem-4/java/assignment3$ java Q1_box 
Volume is 9000.0
Volume is 162.0
*/
