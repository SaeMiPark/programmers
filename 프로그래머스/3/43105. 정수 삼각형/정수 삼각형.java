import java.util.*;

class Solution {
    public  int solution(int[][] triangle) {
        int answer = 0;
        
        int height=triangle.length;

        int[][] dp = new int[height][height];
        dp[0][0] = triangle[0][0];

        for(int i =1;i<height;i++) {
            for(int j =0;j<triangle[i].length;j++) {
                dp[i][j] = triangle[i][j];
                
                // level별 맨 처음
                if(j == 0) dp[i][j] += dp[i-1][j]; 
                
                // level별 맨 끝
                else if(j == triangle[i].length-1) dp[i][j] += dp[i-1][j-1];
                
                else
                    dp[i][j] +=  Math.max(dp[i-1][j-1],dp[i-1][j]);
                
                //처음에 if(첫), if(끝) , X로 했었는데 틀렸다. 왜냐하면 
                //dp[i][0]일때 if(첫)에도 들어가고, 마지막 X에도 들어가게 되는데
                //X j-1을 해줘서 0-1하면 -1이 돼서 arrayindexerror가 뜬다.

            }
        }
        
        
        //마지막 줄 제일 큰 값 출력하기
        for(int j=0; j<dp[height-1].length; j++){
            answer=Math.max(answer, dp[height-1][j]);
        }

        return answer;
    }
}