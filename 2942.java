import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int GCD(int a,int b){
        if (b == 0) return a;
        return GCD(b,a%b);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int r = Integer.parseInt(st.nextToken()),g = Integer.parseInt(st.nextToken());
        int gcd = GCD(r,g);
        for (int i = 1 ; i <= (int)Math.pow(gcd,0.5) ; ++i){
            if (gcd%i == 0){
                sb.append(i);sb.append(' ');sb.append(r/i);sb.append(' ');sb.append(g/i);sb.append('\n');
                if (i*i != gcd){
                    sb.append(gcd/i);sb.append(' ');sb.append(r/gcd*i);sb.append(' ');sb.append(g/gcd*i);sb.append('\n');
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}