import java.io.*;
public class Spy
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int n, num, s=0, p=1;
		System.out.println("Enter the number to be checked");
		n=Integer.parseInt(in.readLine());
		num=n;
		while(num>0)
		{
			s=s+(num%10);
			p=p*(num%10);
			num=num/10;
		}
		if(s==p)
		System.out.println(n+" is a spy number");
		else
		System.out.println(n+" is not a spy number");
	}
}
