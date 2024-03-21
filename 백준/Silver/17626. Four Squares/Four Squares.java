import java.io.*;

public class Main{
    int[] dp;
    public int solution(int n){
        dp=new int[n+1];

        dp[1]=1;
        for(int i=2; i<=n; i++){
            int min=i;
            for(int j=1; j*j<=i; j++){
                if(j*j==i){
                    min=0;
                    break;
                }
                else{
                    min=Math.min(min, dp[i-j*j]);
                }
            }
            dp[i]=min+1;
        }


        return dp[n];

    }

    public static void main(String[] args) throws IOException {
        Main dp1_17626= new Main();
        BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(kb.readLine());
        System.out.println(dp1_17626.solution(n));
    }

}
