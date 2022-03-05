import java.io.*;
public class NumPositiveOrNegative
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int n;
		while(true)
		{
			System.out.println("Enter the number. Or enter 0 to terminate");
			n = Integer.parseInt(in.readLine());
			if (n==0) break;
			if(n>0)
				System.out.println(n+" "+"is a positive integer");
			else System.out.println(n+" "+"is a negative integer");
		}
		System.out.println("Program terminates");
	}
}
