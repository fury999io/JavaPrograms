import java.io.*;
import java.math.*;
public class Series
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
	    int n, a=1;
	    double s=0;
	    System.out.println("Enter the value of n");
	    n=Integer.parseInt(in.readLine());
	    while(a<=n)
	    {
			s=s+(1.0/Math.pow(2,a));
			a++;
		}
		System.out.println("Sum of the series is "+s);
	}
}
