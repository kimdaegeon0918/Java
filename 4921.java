import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 1;
        while (true){
            String n = br.readLine();
            if (n.equals("0")) break;

            String answer = "VALID";
            int l = n.length();
            char p = '1';
            if (n.charAt(0) != '1' || n.charAt(l-1) != '2' || (n.charAt(l-2) != '4' && n.charAt(l-2) != '6')) answer = "NOT";
            for (int i = 1;i < l-1;++i){
                if (answer.equals("NOT")) break;
                char c = n.charAt(i);
                if (p == '1' || p == '3')
                    if (c != '4' && c != '5') answer = "NOT";
                if (p == '4' || p == '6')
                    if (c != '2' && c != '3') answer = "NOT";
                if (p == '5' || p == '7')
                    if (c != '8') answer = "NOT";
                if (p == '8')
                    if (c != '6' && c != '7') answer = "NOT";
                if (c == '1' || c == '2') answer = "NOT";
                p = c;
            }
            System.out.print(t++);
            System.out.println(". "+answer);
        }
        br.close();
    }
}