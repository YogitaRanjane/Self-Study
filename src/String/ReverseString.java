package String;

public class ReverseString {

	public static void main(String[] args) 
	{
		String s="Velocity";
		//        01234567
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);//7=y,6=yt,5=yti,4=ytic,3=ytico,2=yticol,1=yticole,0=yticolev
		}
		System.out.println(temp);
	}

}
