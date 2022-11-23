package hacker_ranck;

import java.util.Scanner;

public class LoopsII {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        if(q>=0 && q<=500) {
            int produto = 0;
            int soma = 0;
            int c = 0;
            for (int i = 0; i < q; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                if((a>=0 && a<=50) && (b>=0 && b<=50) && (n>0 && n<=15)){
                    for (int j = 0; j < n; j++) {
                        produto += (int)(Math.pow(2,j)*b);
                        soma  = a + produto;
                        System.out.printf("%d ", soma);
                    }
                    System.out.println();
                    produto = 0;
                }
            }
        }
        in.close();
    }
}
