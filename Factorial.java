import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Factorial{

    static int factorial(int x){
        int[] dp = new int[x + 1];
        dp[0] = 1;
        for(int i = 1;i<=x;i++){
            dp[i] = dp[i - 1] * i;
        }
        return dp[x];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(factorial(x));
    }
}
