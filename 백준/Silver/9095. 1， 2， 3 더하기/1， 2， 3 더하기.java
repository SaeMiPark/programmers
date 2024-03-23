import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(kb.readLine());
        int[] dp=new int[11];
        int[] arr=new int[n];

        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

        for(int i=4; i<11; i++){
            dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        }

        for(int j=0; j<n; j++){
            arr[j]=Integer.parseInt(kb.readLine());
        }

        for(int k=0;k<arr.length; k++){
            System.out.println(dp[arr[k]]);
        }

    }
}
