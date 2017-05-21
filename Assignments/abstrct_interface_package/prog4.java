package MyPack;
class Balance{
    String name;
    double bal;
    Balance(String n,double b){
	name = n;
	bal = b;
    }
    void show(){
	if(bal <0)
	    System.out.print("----> ");
	System.out.println(name + " : " +bal);
    }
}
class prog4{
    public static void main(String args[])
    {
	Balance current[] = new Balance[3];
	current[0] = new Balance("CM",8765.50);
	current[1] = new Balance("VM",7765.50);
	current[2] = new Balance("SRB",6765.50);
	current[0].show();
	current[1].show();
	current[2].show();
    }
}
/*
cm@cm:~/cm/sem-4/java/assignment5$ javac -d ./ ./prog4.java 
cm@cm:~/cm/sem-4/java/assignment5$ java MyPack.prog4
CM : 8765.5
VM : 7765.5
SRB : 6765.5
*/
