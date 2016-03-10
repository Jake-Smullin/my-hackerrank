import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        for(int i = 0; i < lines; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            for(int j = 0; j < n; j++){
                int printMe = (int)(a + (Math.pow(2, j)*b));
                for(int k = 0; k < j; k++){
                    printMe += (Math.pow(2, k)*b);
                }
                System.out.print(printMe+ " ");
            }
            System.out.println();
        }
    }
}