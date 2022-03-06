//By fury999io
import java.util.Scanner;
class NameReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String names[] = new String[10];
        System.out.println("Enter the names of the 10 students");
        for(int i=0; i<10; i++){
            names[i]=sc.nextLine();
        }
        System.out.println("Names of the student in reverse order:");
        for(int j=9; j>=0; j--){
            System.out.println(names[j]);
        }
    }
}