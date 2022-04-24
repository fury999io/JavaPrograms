import java.util.Scanner;
class MaxVowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String wordv="", word="";
        int vowels1=0, vowels2=0;
        System.out.println("Enter a string");
        String str = sc.nextLine();
        str=str+' ';
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u')
            vowels1++;
            if(str.charAt(i)==' '){
                if(vowels1>vowels2){
                    vowels2=vowels1;
                    vowels1=0;
                    wordv=word;
                }
                word="";
            }
            word=word+str.charAt(i);
        }
        System.out.println("The word with most highest number of vowels is: "+wordv);
    }
}