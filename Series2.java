import java.io.*;
public class Series2
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int i=0, a;
		double s=0;
		System.out.println("Enter the value of a");
		a=Integer.parseInt(in.readLine());
		while(i<10)
		{
			if(i%2==0)
			s=s+Math.pow(a,i);
			else
			s=s-Math.pow(a,i);
			i++;
		}
		System.out.println("The sum of the series is "+s);
	}
}
