import java.util.Scanner;
class fahrenheit_to_celsius
{
    public static void main(String args[])
    {
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = obj.nextDouble();
	double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
