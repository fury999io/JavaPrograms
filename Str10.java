import java.util.Scanner;
class Str10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str[] = new String[10];
        System.out.println("Enter 10 strings");
        for(int i=0; i<10; i++){
            str[i]=sc.nextLine();
        }
        System.out.println("Strings with even number of characters are:");
        for(int j=0; j<10; j++){
            if((str[j].length())%2==0)
            System.out.println(str[j]);
        }
    }
}