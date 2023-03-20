import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int min_val = (int)Math.pow(10, 9);
        int n = Integer.parseInt(br.readLine());
        int a, result = 0, dif;
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; ++i) {
            a = Integer.parseInt(st.nextToken());
            if (a < min_val) min_val = a;
            dif = a - min_val;
            if (dif > result) result = dif;
            sb.append(result + " ");
        }
        System.out.println(sb);
        br.close();
    }
}