import java.util.Scanner;
class CaseCount{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int lc=0, uc=0, n; char chr;
		System.out.println("Enter the number of characters(n) you want to input");
		n=in.nextInt();
		System.out.println("Input the characters");
		for(int cn=1; cn<=n; cn++){
			chr=in.next().charAt(0);
			if(Character.isUpperCase(chr)==true)
			uc=uc+1;
			else
			lc=lc+1;
		}
		System.out.println("Number of Uppercase characters: "+uc);
		System.out.println("Number of Lowercase characters: "+lc);
	}
}
