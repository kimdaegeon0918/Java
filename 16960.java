import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] c = new int[2001];
        int[][] s = new int[2001][2001];
        for (int i = 0;i < n;++i){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            for (int j = 0;j < a;++j){
                int b = Integer.parseInt(st.nextToken());
                ++c[b];
                s[i][j] = b;
            }
        }
        int result = 0;
        for (int i = 0;i < n;++i){
            result = 1;
            for (int j = 0;j < m;++j){
                if (s[i][j] == 0) break;
                if (c[s[i][j]] == 1){
                    result = 0;
                    break;
                }
            }
            if (result == 1) break;
        }

        System.out.println(result);
        br.close();
    }
}