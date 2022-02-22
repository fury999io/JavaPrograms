import java.util.Scanner;
class ArrayGreatestSmallest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n[] = new int[10];
        int gr=0, sm=0;
        for(int i=0; i<10; i++){
            System.out.println("Enter the number");
            n[i]=in.nextInt();
        }
        gr=n[1]; sm=n[1];
        for(int j=0; j<10; j++){
            if(n[j]>gr) gr=n[j];
            if(n[j]<sm) sm=n[j];
        }
        System.out.println("Greatest number: "+gr);
        System.out.println("Smallest number: "+sm);
    }
}