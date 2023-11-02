import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    static int[] l_days = {0,31,29,31,30,31,30,31,31,30,31,30,31};
    static int Y,M,D;
    public static boolean isValid(int y, int m, int d) {
        if (m < 1 || m > 12 || d < 1) return false;
        if (y % 4 == 0 && d > l_days[m]) return false;
        if (y % 4 != 0 && d > days[m]) return false;
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        Y = Integer.parseInt(st.nextToken()); M = Integer.parseInt(st.nextToken()); D = Integer.parseInt(st.nextToken());
        int x = Y*10000+M*100+D;
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
            int count = 0;

            if (isValid(a,b,c) == true){
                count++;
                if (a*10000+b*100+c < x){
                    sb.append("unsafe\n");
                    continue;
                }
            }
            if (isValid(c,b,a) == true){
                count++;
                if (c*10000+b*100+a < x){
                    sb.append("unsafe\n");
                    continue;
                }
            }
            if (isValid(c,a,b) == true){
                count++;
                if (c*10000+a*100+b < x){
                    sb.append("unsafe\n");
                    continue;
                }
            }
            sb.append((count == 0) ? "invalid\n" : "safe\n");
        }
        System.out.println(sb);
    }
}