package hacker_ranck.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if(N>=2 && N<=20){
            for (int i = 0; i < 10; i++) {
                System.out.printf("%d x %d = %d\n",N, i+1,(N*(i+1)));
            }
        }

        bufferedReader.close();
    }
}
