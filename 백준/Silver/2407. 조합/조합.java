import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int n=Integer.parseInt(arr[0]);
        int m=Integer.parseInt(arr[1]);

        BigInteger[][] bi= new BigInteger[n+1][n+1];
        for(int i=1; i<=n; i++){
            for(int j=0; j<=i; j++){
                if(j==0||i==j){
                    bi[i][j]=BigInteger.ONE;
                    //사이드 1
                }
                else {
                    bi[i][j] = bi[i-1][j-1].add(bi[i-1][j]);
                }
            }
        }
        System.out.println(bi[n][m]);

    }
}
