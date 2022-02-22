import java.util.Scanner;
class Chr10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char chr; int sum=0;
		System.out.println("Input the characters");
		for(int n=1;n<=10;n++)
		{
		chr=sc.next().charAt(0);
		sum=sum+(int)chr;
	    }
	    System.out.println("Sum of the ASCII codes: "+sum);
	}
}
