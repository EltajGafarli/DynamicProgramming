package Solution;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Fibonnaci{

   static int fibonnaci(int n){
       int[] dp = new int[n + 2];
       dp[0] = 0;
       dp[1] = 1;
       for(int i = 2;i<=n;i++){
           dp[i] = dp[i - 1] + dp[i - 2];
       }
       return dp[n];
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fibonnaci(x));
    }
}
