import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int i = 1 ; i <= 3 ; ++i){
            String a = s.substring(0,i);
            int start = Integer.parseInt(a);
            int end = start;
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            while (sb.length() < s.length()){
                sb.append(Integer.toString(++end));
            }
            if (s.equals(sb.toString())){
                System.out.println(start+" "+end);
                break;
            }
        }
        br.close();
    }
}