import java.util.*;
public class NumberSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("Input a number");
            n[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched in the array");
        int num=sc.nextInt();
        for(int i=0; i<10; i++){
            if(num==n[i]){
            System.out.println("The number is present");
            }
            else continue;
        }
    }
}        