import java.io.*;
public class NegativeNum
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		
		int c, n, s;
		c=0; 
		s=0;
		
		System.out.println("Enter any 10 numbers");
		while(c<10)
		{
			n = Integer.parseInt(in.readLine());
			if(n<0)
			{
				s = s+n;
			}
			c++;
		}
		System.out.println("The sum of the negative numbers is" +s);
	}
}
