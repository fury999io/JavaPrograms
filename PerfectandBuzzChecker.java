import java.util.Scanner;
class PerfectandBuzzChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[20]; int c;
        System.out.println("Enter 20 numbers");
        for(int i=0; i<20; i++){
            n[i]=sc.nextInt();
        }
        System.out.println("Input 1 to display perfect numbers and 2 to display buzz numbers");
        c=sc.nextInt();
        switch(c){

            case 1:
            System.out.println("The perfect numbers are: ");
            for(int j=0; j<20; j++){
                int sum=0;
                for(int k=1; k<n[j]; k++){
                    if(n[j]%k==0) sum+=sum+k;
                }
                if(n[j]==sum) System.out.print(n[j]+", ");
            }
            break;

            case 2:
            System.out.println("The buzz numbers are: ");
            for(int k=0; k<20; k++){
                int lst=0; int num=n[k];
                while(num>0){
                    lst=num;
                    num=num/10;
                }
                if(n[k]%7==0)
                System.out.print(n[k]+", ");
                else if(lst==7)
                System.out.print(n[k]+", ");
            }
            break;
        }
    }
}