import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1 ; i < n ; ++i) dp[i] = 1000;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0 ; i < n ; ++i){
            int k = Math.min(i+Integer.parseInt(st.nextToken()),n-1);
            for (int j = i+1 ; j <= k ; ++j)
                dp[j] = Math.min(dp[j], dp[i] + 1);
        }
        System.out.println((dp[n-1] == 1000) ? -1 : dp[n-1]);
        br.close();
    }
}