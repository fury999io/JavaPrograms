import java.util.*;
public class Int20{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n[] = new int[20]; int even=0, odd=0, mult=0;
        for(int i=0; i<20; i++){
            System.out.println("Enter a number");
            n[i]=in.nextInt();
        }
        for(int i=0; i<20; i++){
            if(n[i]%2==0) even++;
            else odd++;
        }
        for(int i=0; i<20; i++){
            if(n[i]%4==0) mult++;
        }
        System.out.println("Number of even numbers: "+even);
        System.out.println("Number of odd numbers: "+odd);
        System.out.println("Number of multiples numbers: "+mult);
    }
}