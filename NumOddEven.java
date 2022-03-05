import java.io.*;
public class NumOddEven
{
	public static void main(String[] args) throws IOException
	{
	InputStreamReader read = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(read);
	int num, dig;
	System.out.println("Enter the number");
	num = Integer.parseInt(in.readLine());
	while(num>0)
	{
		dig = num%10;
		num = num/10;
		
		if(dig%2==0)
		{
			System.out.println(dig);
			System.out.print(" is an even digit");
		}
		else if(dig%2==1)
		{
			System.out.println(dig);
			System.out.print(" is an odd digit");
		}
		else
		{
			System.out.print("0 is neither even nor odd");
		}
	}
}
}
