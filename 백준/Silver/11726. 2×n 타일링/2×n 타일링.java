import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(kb.readLine());

        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
//        dp[2]=2하면 n=1일때 ArrayIndexOut 에러가 발생
        for(int i=2; i<=n; i++){
            dp[i]=(dp[i-1]+dp[i-2])%10007;
        }

        System.out.println(dp[n]);


    }
}
