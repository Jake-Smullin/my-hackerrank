import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        if(line.length() % 2 == 0)
            System.out.println(check(line));
        else
            System.out.println("False");
    }
    
    public static String check(String line){
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < line.length(); i++) {
            char closing = line.charAt(i);
            switch (closing) {
                case '{': 
                case '[':
                case '(':
                    stack.push(closing);
                    break;
                case '}': 
                case ']':
                case ')':
                    if (!stack.isEmpty()) {
                        char opening = stack.pop();
                        if ((closing == '}' && opening != '{') || (closing == ']' && opening != '[') || (closing == ')' && opening != '('))
                            return "False";
                    } else

                        return "False";
                        break;
                default:
                    break;
          }
       }
       return "True";
    }
}