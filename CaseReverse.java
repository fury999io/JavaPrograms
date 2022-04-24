import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;
class CaseReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string");
        str=sc.nextLine();
        int n = str.length();
        for(int i=0; i<n; i++){
            if(Character.isUpperCase(str.charAt(i)))
            System.out.print(Character.toLowerCase(str.charAt(i)));
            else if(Character.isLowerCase(str.charAt(i)))
            System.out.print(Character.toUpperCase(str.charAt(i)));
            else
            System.out.print(str.charAt(i)); 
        }
    }
}