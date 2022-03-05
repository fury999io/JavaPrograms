import java.io.*;
public class Perfect
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int n,num, c, s=0;
		System.out.println("Enter the number to be checked for perfect number");
		n=Integer.parseInt(in.readLine());
		num=n;
		for(c=1;c<n;c++)
		{
			if(n%c==0)
			s=s+c;
		} 
		if(s==n)
		System.out.println(n+" is a perfect number");
		else
		System.out.println(n+" is not a perfect number");
	}
}
