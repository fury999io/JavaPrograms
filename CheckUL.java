import java.util.*;
class CheckUL{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char cr;
		System.out.println("Enter the character to check");
		cr=sc.next().charAt(0);
		if(Character.isUpperCase(cr)==true)
		System.out.println("The character is upper case");
		else if(Character.isLowerCase(cr)==true)
		System.out.println("The character is lower case");
		else if(Character.isDigit(cr)==true)
		System.out.println("It is a digit");
		else
		System.out.println("It is a special character");
	}
}
