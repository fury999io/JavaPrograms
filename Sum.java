import java.io.*;
public class Sum
{
public static void main(String[] args) throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int a=1, n, s=0;;
System.out.println("Enter the ending number starting from 1");
n = Integer.parseInt(in.readLine());
while(a<=n)
{
	s=s+a;
    a++;
}
System.out.println("The sum of the numbers from 1 to n is" +s);
}
}
