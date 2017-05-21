//Assignment five program 1
abstract class colddrink
{
    void addSugar()
    {
	System.out.println("Sugar Added");
    }
    void addColor()
    {
	System.out.println("Color added");
    }
    void addSoda()
    {
	System.out.println("Soda Added");
    }
    public abstract void  getManufactureName();
    public abstract void addsecreatformula();
}
class cocacola extends colddrink
{
    public void getManufactureName()
    {
	System.out.println("Cococola");
    }
    public void addsecreatformula()
    {
	System.out.println("Secreate formula added");
    }
}
class pepsi extends colddrink
{
    public void getManufactureName()
    {
	System.out.println("Pepsi");
    }
    public void addsecreatformula()
    {
	System.out.println("Secreate formula added");
    }
}
class thumpsup extends colddrink
{
    
    public void getManufactureName()
    {
	System.out.println("thumpsup");
    }
    public void addsecreatformula()
    {
	System.out.println("Secreate formula added");
    }
}
class prog1
{
    public static void  main(String args[])
    {
	cocacola obj=new cocacola();
	pepsi obj1=new pepsi();
	obj.addSugar();
	obj.addColor();
	obj.addSoda();
	obj.getManufactureName();
	obj.addsecreatformula();
	obj1.addSugar();
	obj1.addColor();
	obj1.addSoda();
	obj1.getManufactureName();
	obj1.addsecreatformula();
    }
}
/*cm@cm:~/cm/sem-4/java/assignment5$ javac prog1.java
cm@cm:~/cm/sem-4/java/assignment5$ java prog1
Sugar Added
Color added
Soda Added
Cococola
Secreate formula added
Sugar Added
Color added
Soda Added
Pepsi
Secreate formula added
 */
