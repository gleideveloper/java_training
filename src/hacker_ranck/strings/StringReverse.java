package hacker_ranck.strings;

import java.util.Locale;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(A.length()<50){
            if(isPalindrome(A)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    private static boolean isPalindrome(String a) {
        String reversed =  new StringBuilder(a).reverse().toString();
        return a.equals(reversed);
    }
}
