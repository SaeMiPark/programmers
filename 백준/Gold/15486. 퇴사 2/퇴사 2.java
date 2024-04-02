import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        //1일에 시작해서 3일 동안 상담을 한다. 돈을 받는 날짜는 +1이다.
        //즉 다음 상담일은 4일
        //따라서 기존 [n+1]=>[N+2]를 해주어야 한다.
        int[][] arr=new int[n+2][2];
        int[] dp=new int[n+2];


        //1~7일까지
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            arr[i][0] = t; //시간
            arr[i][1] = p; //금액
        }


        int max=Integer.MIN_VALUE;
        for(int i=1; i<=n+1; i++){//1~8일까지
            //max의 의미
            //여태까지 모든 경로에서 얻었던 최대값
            if(max<dp[i]){
                max=dp[i];
            }
            int nxt=i+arr[i][0]; //(돈을 받는 날)==(i+t)==(nxt)
            if(nxt<=n+1){
                //nxt에 도착한 적이 없다면 0일 것.
                //nxt에 도착한 적이 있다면 여태 경로를 가지고 있을 것

                //즉
                //nxt에 이전에 도착했던 경로와
                //현재 내가 접근 하고 있는 경로를 비교할 것
                dp[nxt]=Math.max(dp[nxt],max+arr[i][1]);
            }
        }
        System.out.print(max);

    }
}
