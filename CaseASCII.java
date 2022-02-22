import java.io.*;
class CaseASCII{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		char chr;
		System.out.println("Input the letter");
		chr=(char)(in.read());
		if(Character.isUpperCase(chr)==true)
		Character.toLowerCase(chr);
		else if((Character.isLowerCase(chr)==true))
		Character.toUpperCase(chr);
		System.out.print((int)(chr));
	}
}
