package day_6_assignments;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int no=13;
boolean flag =false;
for (int i=2; i<=no; i++)
{
	if (no%i==0)
	{
		flag=true;
		break;
	}
}
if (flag==false)
{
	System.out.println("Prime Number"+no);
}
else
{
	System.out.println("Not a Prime Number"+no);
}
	}

}
