package hacker_ranck.introduction;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(sc.hasNext()){
            String lsc = sc.nextLine();
            System.out.printf("%d %s\n",count++, lsc);
        }
    }
}
