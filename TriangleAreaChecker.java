import java.util.*;
class TriangleAreaChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double s, s1, s2, s3, ar, c=0.0; double ans[] = new double[40];
        System.out.println("Input the value of side 1 of the triangle");
        s1=(double)sc.nextDouble();
        System.out.println("Input the value of side 2 of the triangle");
        s2=(double)sc.nextDouble();
        System.out.println("Input the value of side 3 of the triangle");
        s3=(double)sc.nextDouble();
        s=(s1+s2+s3)/2.0;
        ar=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        for(int i=0; i<40; i++){
            System.out.println("Enter the answer obtained by the student");
            ans[i]=(double)sc.nextDouble();
        }
        for(int j=0; j<40; j++){
                if(ans[j]==ar) c=c+1.0;
        }
        System.out.println("Correct answer is "+ar);
        System.out.println("Number of students who gave correct answer: "+c);
    }
}
