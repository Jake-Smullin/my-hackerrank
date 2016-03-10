import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        Integer M = input.nextInt();
        int count = 0;
        LinkedList<Integer> list = new LinkedList<Integer>();
        while(input.hasNext()){
            list.addFirst(input.nextInt());
            count++;
            if(count >= 500000){
                System.out.println("NIL");
                return;
            }
        }
        if(list.size() < M){
            System.out.println("NIL");
        }
        else{
            System.out.println(list.get(M-1));
        }
        return;
    }
}