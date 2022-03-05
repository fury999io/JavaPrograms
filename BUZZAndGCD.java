import java.io.*;
public class BUZZAndGCD
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int n, num1, num2, t;
		System.out.println("Enter 1 to check a BUZZ number");
		System.out.println("Enter 2 to check GCD of two numbers");
		System.out.println("Enter your choice");
		n=Integer.parseInt(in.readLine());
		switch(n)
		{
			case 1: 
			System.out.println("Enter a number");
			num1=Integer.parseInt(in.readLine());
			if(num1%7==0||num1%10==7)
			System.out.println(num1+" is a BUZZ number");
			else 
			System.out.println(num1+" is not a BUZZ number");
			break;
			
			case 2:
			System.out.println("Enter the first number");
			num1=Integer.parseInt(in.readLine());
			System.out.println("Enter the second number");
			num2=Integer.parseInt(in.readLine());
			while(num1%num2!=0)
			{
				t=num1%num2;
				num1=num2;
				num2=t;
			}
			System.out.println("GCD of the 2 numbrs="+num2);
			break;
			
			default:
			System.out.println("Wrong Choice!");
			break;
		}
	}
}
