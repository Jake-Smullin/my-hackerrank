import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String sinput = input.nextLine();
        sinput = sinput.replace(",", "");
        String[] numbers = sinput.split(" ");
        Arrays.sort(numbers);
        String temp = numbers[0];
        
        for(int i = 0; i < numbers.length; i+=2){
            if(i + 1 > numbers.length - 1|| !temp.equals(numbers[i + 1])){
                System.out.println(numbers[i]);
                input.close();
                return;
            }
            temp = numbers[i+2];
        }
        
        input.close();
        return;
    }
}