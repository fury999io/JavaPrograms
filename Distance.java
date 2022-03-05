import java.util.*;
public class Distance{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2, ab;
		System.out.println("Enter the value of the coordinates in the given order: x1, y1, x2. y2");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		ab=Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2));
		System.out.println("The distance between points A and B are "+ab);
	}
}
