import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        int[] dp=new int[n];

        StringTokenizer st= new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //초기화
        dp[0]=arr[0];

        for(int i=1; i<n; i++){
            dp[i]=arr[i]; //자신의 값을 저장
            for(int j=0; j<i; j++) {
                if (dp[i] > dp[j]) {           //나보다는 작고 여태 dp중에서는 제일 커야함.
                    dp[i] = Math.max(dp[i], arr[i]+dp[j]);//여태 최댓값 가진 dp값 저장.
                }
            }
        }

        int answer=0;

        for(int x: dp){
            answer=Math.max(answer,x);
        }

        System.out.print(answer);
        
    }
}
