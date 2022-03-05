import java.io.*;
public class SumOf2num
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		
		int n1, n2, sum, counter=0;
		while(counter<10)
		{
		System.out.println("Enter the first number");
		n1 = Integer.parseInt(in.readLine());
		System.out.println("Enter the second number");
		n2 = Integer.parseInt(in.readLine());
		sum = n1 + n2;
		if(sum<0) continue;
		System.out.println("The sum of the two numbers are" +sum);
	    }
		
	}
}
