import java.io.*;
public class NaturalNum
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int n, sum=0, i=0;
		while(i<10)
		{
			System.out.println("Enter a number");
			n=Integer.parseInt(in.readLine());
			sum=sum+n;
			i++;
		
		}
		System.out.println("The sum of the numbers = "+sum);
	}
}
