import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] s = new String [50];
        for (int i = 0;i < n;++i){ s[i] = br.readLine(); }

        int k;
        if (n < m) { k = n; }
        else { k = m; }

        int result = 0;
        while (k-- > 0){
            for (int i = 0;i < n-k;++i){
                for (int j = 0;j < m-k;++j){
                    if (s[i].charAt(j) == s[i].charAt(j+k) && s[i].charAt(j) == s[i+k].charAt(j) && s[i].charAt(j) == s[i+k].charAt(j+k)){
                        result = (k+1)*(k+1);
                    }
                }
            }
            if (result!=0) break;
        }
        System.out.println(result);
        br.close();
    }
}