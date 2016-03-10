import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int sum = 1;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n == 0){
            System.out.println(1);
            return;
        }
        BigInteger sum = BigInteger.valueOf(n);
        System.out.println(factorial(n, sum));
    }
    
    public static BigInteger factorial(int n, BigInteger sum){
        for(int i = n -1; i > 0; i--){
            sum = sum.multiply((BigInteger.valueOf(i)));
        }
        return sum;
    }
}