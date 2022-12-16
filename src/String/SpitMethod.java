package String;

public class SpitMethod {

	public static void main(String[] args) 
	{
		String s="Velocity Corporate Traning Center Pune";
		//           0        1         2       3     4
		String[] ThisString = s.split(" ");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(ThisString[i]);
		}
	}

}
