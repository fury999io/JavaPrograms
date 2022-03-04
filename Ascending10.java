import java.util.Scanner;
public class Ascending10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("Enter a number");
            n[i]=sc.nextInt();
        }
        for(int j=0; j<10; j++){
            for(int k=j; k<10; k++){
                if(n[k]<n[j]){
                    int temp=n[j];
                    n[j]=n[k];
                    n[k]=temp;
                }
            }
        }
        System.out.println("The numbers in ascending order are: ");
        for(int l=0; l<10; l++){
            System.out.print(n[l]);
        }

    }
}