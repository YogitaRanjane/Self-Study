package Variable_Study;

public class AbcVariable {
	
	String emp_name;
	float emp_age;
	char emp_gender;
	double emp_salary;
	
	public void emp_info()
	{
		System.out.println("Name is "+ emp_name);
		System.out.println("Age is "+ emp_age);
		System.out.println("Gender is "+ emp_gender);
		System.out.println("Salary is "+ emp_salary);
	
	}
	

	public static void main(String[] args) 
	{
		int rollNumber;
		String name;
		char gender;
		float age;
		double salary;
		
		rollNumber=10;
		name="Rahi";
		gender='f';
		age=2.6f;
		salary=600000.00d;
		
		System.out.println("Roll no is "+rollNumber);
		System.out.println("Name is "+name);
		System.out.println("Gender is "+gender);
		System.out.println("Age is "+age);
		System.out.println("Salary is "+salary);
		System.out.println("===================================================");
		
		
		}

}
