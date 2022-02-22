import java.util.*;
public class BinaryCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        int chk;
        int min=1, max=10, mid=0;
        for(int i=0; i<10; i++){
            System.out.println("Enter a number");
            n[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be checked in the array");
        chk=sc.nextInt();
        min=1; max=10;
        while(mid>=1 || mid<=10){
            if(chk==mid){ System.out.println("Search successful");
            System.exit(0);
            }
            else{ 
                if(chk>mid){
                    min=mid+1;
                    mid=min+mid/2;
                }
                else{
                    max=mid-1;
                    mid=min+mid/2;
                }
            }
        }
        System.out.println("Search unsuccessful");
    }
}