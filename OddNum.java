import java.io.*;
public class OddNum
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);                   
		int n;
		n=1;
		while(n<11)
		{
			if(n%2!=0)
			System.out.println(n);
		    else continue;
		    n++;
		}
	}
}
