//Assignment four program 2
class Fe
{
    int f_roll_no;
    double f_per;
    Fe(int roll_no,double per)
    {
	roll_no=roll_no;
	per=per;
    }
}
class Se extends Fe
{
    int s_roll_no;
    double s_per;
    Se(int s_roll_no,double s_per)
    {
	s_roll_no=s_roll_no;
	s_per=s_per;
    }
}
class Te extends Se
{
    int t_roll_no;
    double t_per;
    Te(int t_roll_no,double t_per)
    {
	t_roll_no=t_roll_no;
	t_per=t_per;
    }
    public double avrage(double f,double s,double t)
    {
	return ((f+s+t)/3);
    }
}
class prog2
{
    public static void main(String args[])
    {
	Fe obj=new Te(121,12.0);
    }
}
