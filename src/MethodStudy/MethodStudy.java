package MethodStudy;

public class MethodStudy 
{

	public static void main(String[] args) 
	{
		addition();
		addition1(14, 14);
		MethodStudy m=new MethodStudy();
		m.substraction();
		m.substraction(80,20);
		
	}
	
	//static method without parameter
	public static void addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	
	//static method with parameter
	public static void addition1(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	
	//non-static method without parameter
	public void substraction() 
	{
		int x=50;
		int y=20;
		int sub=x-y;
		System.out.println("Substraction is "+sub);
	}
	
	//non-static method with parameter
	public void substraction(int x,int y)
	{
		int sub=x-y;
		System.out.println("sub is "+sub);
	}
}
