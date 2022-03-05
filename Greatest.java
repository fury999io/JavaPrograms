import java.util.*;
public class Greatest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		System.out.println("Enter the three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=Math.max(a, b);
		e=Math.max(d, c);
		System.out.println("The greatest number is "+e);
		
	}
}
