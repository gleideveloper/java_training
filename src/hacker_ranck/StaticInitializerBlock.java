package hacker_ranck;

import java.util.Scanner;

public class StaticInitializerBlock {
    private static final Scanner scanner = new Scanner(System.in);
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    private static boolean flag =  false;

    static {
        if ((B >= -100 && B <= 100) && (H >= -100 && H <= 100)) {
            if((B > 0 && H > 0)) {
                flag = true;
            }else{
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }//end of main
}//end of class