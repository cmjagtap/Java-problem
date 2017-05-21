//Assignment four program 1
class human
{
    public String human_name,human_country;
    public int age;
    human(String human_name,int age,String human_country)
    {	
	human_name=human_name;
	age=age;
	human_country=human_country;
    }
    public void human_desc()
    {
	System.out.println("Human name "+human_name);
	System.out.println("human age is" +age);
	System.out.println("Human country"+human_country);
    } 
}
class prog1 extends human
{
    public String occupation,human_hobby;
    prog1(String oc,String h)
    {
	occupation=oc;
	human_hobby=h;
    }
    public void human_desc()
    {
	System.out.println("Occupation is "+occupation);
	System.out.println("human hobby is "+human_hobby);
    }
    public static void main(String args[])
    {
	//human obj1=new human();
	prog1 obj=new prog1("cm",23,"india");
       	//obj.human_desc();
    }
}
