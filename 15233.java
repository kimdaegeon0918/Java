import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());

        Map<String,Integer> player = new HashMap<>();
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0 ; i < a ; ++i)
            player.put(st.nextToken(),1);
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0 ; i < b ; ++i)
            player.put(st.nextToken(),2);

        st = new StringTokenizer(br.readLine()," ");
        a=0; b=0;
        for (int i = 0 ; i < c ; ++i){
            if (player.get(st.nextToken()) == 1) a++;
            else b++;
        }

        if (a>b) System.out.println('A');
        else if (a<b) System.out.println('B');
        else System.out.println("TIE");

        br.close();
    }
}