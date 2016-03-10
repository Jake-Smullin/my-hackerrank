import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            int max = 0;
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                System.out.print(s1);
                int x=sc.nextInt();
                int size = 1;
                if(x != 0)
                    size = (int)Math.log10(x) +1;
                for(int j = 0; j < 15 - s1.length(); j++){
                    System.out.print(" ");
                }
                for(int j = size; j < 3; j++){
                    System.out.print("0");
                }
                
                System.out.println(x);
            }
            System.out.println("================================");

    }
}