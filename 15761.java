import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] w = new int[n];
        for (int i = 0 ; i < n ; ++i){
            w[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(w);

        int count = 0;
        while (--n >= 0){
            if (w[n] < count) break;
            count++;
        }

        System.out.println(count);
        br.close();
    }
}