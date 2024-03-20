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
    
    public static void main(String[] args){
        Main m=new Main();
        Scanner kb= new Scanner(System.in);
        int n=kb.nextInt();
        arr=new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i]=kb.nextInt();
        }

        System.out.println(m.solution(n));
    }
}