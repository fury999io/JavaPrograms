import java.util.*;
public class AreaOfTriangles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c,n, s;
		System.out.println("Calculator of area of triangles");
		System.out.println("For Equilateral triangle, enter 1");
		System.out.println("For Isosceles triangle, enter 2");
		System.out.println("For Scalene triangle, enter 3");
		n=sc.nextInt();
		switch(n){
			case 1:
			System.out.println("Enter the side of the triangle");
			a=sc.nextInt();
			System.out.println("Area of the triangle = "+(Math.sqrt(3)/4*Math.pow(a, 2)));
			break;
			case 2:
			System.out.println("Enter the base and side of the triangle");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Area of the triangle = "+(1/4*b*Math.sqrt((4*a*a)-(b*b))));
			break;
			case 3:
			System.out.println("Enter the sides of the triangle");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			s=(a+b+c)/2;
			System.out.println("Area of the triangle = "+(Math.sqrt((s*(s-a)*(s-b)*(s-c)))));
			break;
		}
	}
}
