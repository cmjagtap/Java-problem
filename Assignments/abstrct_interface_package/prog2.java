abstract class Polygon {
    public abstract double area();
    public abstract double perimeter();
    void printMyName(){
	System.out.println("In Plygon");
    }
}
class Rectangle extends Polygon {
    double width, length; 
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }    
    public double area() {
	return width * length;
    }
    public double perimeter() {
	return 2 * (width + length);
    }   
}
class Square extends Polygon{
    double length; 
    public Square(double length) {
        this.length = length;
    }    
    public double area() {
	return length * length;
    }
    public double perimeter() {
	return 4 *length;
    }   
    
}
class Rhombus extends Polygon {
    double width, length,side; 
    public Rhombus(double width, double length,double side) {
        this.width = width;
        this.length = length;
	this.side = side;
    }    
    public double area() {
	return width * length /2;
    }
    public double perimeter() {
	return 4 *side;
    }   
}
public class prog2{
    public static void main(String[] args) {
	double width = 5, length = 7,side = 4;
        Rectangle rect = new Rectangle(width, length);
        System.out.println("Rectangle width: "+width+" and length: "+length+"\narea: " + rect.area()+ "\nperimeter: "+rect.perimeter() + "\n");
	
	Polygon square =  new Square(length);
        System.out.println("Square length" + length + "\nArea: " + square.area()+ "\nPerimeter: " + square.perimeter() + "\n");

        Polygon rhombus = new Rhombus(width,length,side);
        System.out.println("Rhombus lengths: " +side + ", " + width + ", " + length+ "\nArea: " + rhombus.area()+ "\n Perimeter: " + rhombus.perimeter() + "\n");
    }
}
