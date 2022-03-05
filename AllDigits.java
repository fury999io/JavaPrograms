import java.io.*;
public class AllDigits
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int dig, num;
		System.out.println("Enter the number");
		num = Integer.parseInt(in.readLine());
		System.out.println("The digits of the number are");
		while(num>0)
		{
			dig = num%10;
			System.out.println(dig);
			num = num/10;
		}
	}
}
