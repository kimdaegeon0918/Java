import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        st.nextToken();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int i = 0;
        while (++i > 0){
            if (a%2 == 0) a = a/2;
            else a = a/2+1;
            if (b%2 == 0) b = b/2;
            else b = b/2+1;
            if (a == b) {
                System.out.println(i);
                break;
            }
        }
        br.close();
    }
}