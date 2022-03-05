import java.io.*;
import java.math.*;
public class PerfectSq
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int n;
		double r;
		while(true)
		{
			System.out.println("Enter the number. Or enter 0 to terminate");
			n = Integer.parseInt(in.readLine());
			r = Math.sqrt(n);
			if(n==0) break;
			if((int)r*r==n)
			{
				System.out.println(n +"is a perfect square number");
			}
			else
			{
				System.out.println(n +"is not a perfect square number");
			}
			System.out.println("");
		}
	}
}
