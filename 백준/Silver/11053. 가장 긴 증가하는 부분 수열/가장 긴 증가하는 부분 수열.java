import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] str= br.readLine().split(" ");

        int[] arr=new int[n+1]; //size=7, 0,1~6
        for(int i=0; i<str.length; i++){
            arr[i+1]= Integer.parseInt(str[i]);
            //System.out.println(arr[i+1]);
        }

        int answer=0;
        int[] dy=new int[n+1];
        dy[1]=1;

        //2~6
        for(int i=2; i<=n; i++){
            int max=0;
            for(int j=i-1; j>=1; j--){
                if(arr[i]>arr[j]){
                    max=Math.max(max, dy[j]);
                }
            }
            dy[i]=max+1;
        }

        for(int i=1; i<=n; i++){
            answer=Math.max(answer, dy[i]);
        }

        System.out.println(answer);
    }
}
