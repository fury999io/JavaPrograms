import java.util.*;
public class DivisibleBy3or5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n[]= new int[20];
        for(int i=0; i<20; i++){
            System.out.println("Enter the number");
            n[i]=sc.nextInt();
        }
        for(int j=0; j<20; j++){
            if(n[j]%3==0 || n[j]%5==0)
            sum=sum+n[j];
            else continue;
        }
        System.out.println("The sum of the numbers which are divisible by 3 or 5 is: "+sum);
    }
}