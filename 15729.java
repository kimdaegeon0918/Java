import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = 0,b = 0,c = 0,count = 0;
        for (int i = 0;i < n;++i){
            int x = Integer.parseInt(st.nextToken());
            if (x != a){
                ++count;
                a = b^1;
                b = c^1;
            }
            else{
                a = b;
                b = c;
            }
            c = 0;
        }
        System.out.println(count);
        br.close();
    }
}