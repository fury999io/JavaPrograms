import java.io.*;
public class Marks{
    public static void main(String[] args) throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int phy[]=new int[40]; int chem[]=new int[40]; int mat[]=new int[40]; int aggr[]=new int[40];
        int per80=0, per34=0;
        for(int i=0; i<40; i++){
            System.out.println("Enter the marks obtained by student "+(i+1)+" in Physics, Chemistry and Maths one by one");
            phy[i]=Integer.parseInt(in.readLine());
            chem[i]=Integer.parseInt(in.readLine());
            mat[i]=Integer.parseInt(in.readLine());
            aggr[i]=(phy[i]+chem[1]+mat[1])/3;
        }
        for(int j=0; j<40; j++){
            if(aggr[j]>=80) per80=per80+1;
            if(aggr[j]<=34) per80=per80+1;
        }
        System.out.println("Number of students getting 80 percent and above: "+per80);
        System.out.println("Number of students getting 34 percent and below: "+per34);
    }
}