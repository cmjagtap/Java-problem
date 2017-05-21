interface p   
{  
    int p=0;  
    void display_p();  
}  
 interface p1 extends p  
 {  
     int p1=1;  
     void display_p1();  
 }  
 interface p2 extends p  
 {  
     int p2=2;  
     void display_p2();  
 }  
interface p12 extends p1,p2  
{  
    int p12=12;  
    void display_p12();  
}  
 class Q implements p12  
 {  
     int q=3;  
     public void display_p()  
     {  
	 System.out.println("\nInterface P, Constant in P: "+p);  
     }  
     public void display_p1()  
     {  
	 System.out.println("Interface P1 Extends P, Constant in P1: "+p1);  
     }  
     public void display_p2()  
     {  
	 System.out.println("Interface P2 Extends P, Constant in P2: "+p2);  
     }  
     public void display_p12()  
     {  
	 System.out.println("Interface P12 Extends P1 & P2, Constant in P12: "+p12);  
     }  
     void display_q()  
     {  
	 System.out.println("Class Q Implements P12, Constant in Q: "+q);  
     }  
 }  
 class Main_Interface  
 {  
     public static void main(String args[])  
     {  
	 Q object = new Q();  
	 object.display_p();  
	 object.display_p1();  
	 object.display_p2();  
	 object.display_p12();  
	 object.display_q();            
     }  
 }  
