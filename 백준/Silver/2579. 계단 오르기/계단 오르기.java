import java.io.*;
import java.util.*;

public class Main{
    static int[] arr;

    public int solution(int n){
        int[] dp=new int[n+1];

        dp[1]=arr[1];
        if(n>=2){
            dp[2]=arr[1]+arr[2];
        }

        for(int i=3; i<=n; i++){
            dp[i]=Math.max(dp[i-2], dp[i-3]+arr[i-1])+arr[i];
        }
    

        return dp[n];
    }
    
    public static void main(String[] args) throws IOException {
        Main S=new Main();
        BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(kb.readLine());
        arr=new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i]=Integer.parseInt(kb.readLine());
        }

        System.out.println(S.solution(n));
    }
}