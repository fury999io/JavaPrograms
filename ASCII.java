import java.util.*;
public class ASCII
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n, num=0;
		System.out.println("To convert from ASCII code to ASCII value enter 1");
		System.out.println("To convert from ASCII value to ASCII code enter 2");
		n=in.nextInt();
		if(n==1)
		{
			System.out.println("Enter the ASCII code");
			num=in.nextInt();
			char a=(char)num;
			System.out.println("The ASCII value is: "+a);
		}
		
		else
		{
			char a=0;
			System.out.println("Enter the ASCII value");
			a=in.next().charAt(0);
			num=(int)a;
			System.out.println("The ASCII code is: "+num);
		}
	}
}
