import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0 ; i < n ; ++i){
            String w = br.readLine();
            if (set.contains(w) == false){
                ++result;
                int l = w.length();
                for (int j = 0 ; j < l ; ++j){
                    w = w.substring(l-1)+w.substring(0,l-1);
                    set.add(w);
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}