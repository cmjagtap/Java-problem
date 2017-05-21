//Assignment first program 4
class prog4
{
    public static void main(String args[])
    {
	double x =Double.parseDouble(args[0]);
	x = Math.toRadians(x);
	System.out.println("Math.sin(" + x + ")=" + Math.sin(x));
	System.out.println("Math.cos(" + x + ")=" + Math.cos(x));
    }
}
/*
cm@cm:~/cm/sem-4/java/assignment$  java prog4  4
Math.sin(0.06981317007977318)=0.0697564737441253
Math.cos(0.06981317007977318)=0.9975640502598242
*/
