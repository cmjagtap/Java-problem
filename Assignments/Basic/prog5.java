//Assignment first program 5
class prog5
{
        public static void main(String args[])
        {
                int p=Integer.parseInt(args[0]);
                int y=Integer.parseInt(args[1]);
                int R=Integer.parseInt(args[2]);
                double n=12*y;
                double r=R/(12*100);
                double payment=(p*r)/(1-(Math.pow((1+r),(-n))));
                System.out.println("Payment is "+payment);
        }
}         
/*
cm@cm:~/cm/sem-4/java/assignment$ java prog5 10 100 100000
Payment is 830.0
 */
