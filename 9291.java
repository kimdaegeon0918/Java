import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int n = 1; n <= t; ++n){
            char[][] grid=new char [9][9];
            boolean result = true;
            for (int i = 0; i < 9; ++i) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < 9; ++j)
                    grid[i][j] = st.nextToken().charAt(0);
            }

            for (int i = 0; i < 9; ++i) {
                HashSet<Character> set1 = new HashSet<Character>();
                HashSet<Character> set2 = new HashSet<Character>();
                for (int j = 0; j < 9; ++j) {
                    set1.add(grid[i][j]);
                    set2.add(grid[j][i]);
                }
                if (set1.size() != 9 || set2.size() != 9){
                    result = false;
                    break;
                }
            }

            for (int i = 0; i < 3; ++i)
                for (int j = 0; j < 3; ++j) {
                    HashSet<Character> set = new HashSet<Character>();
                    for (int k = 0; k < 3; ++k)
                        for (int l = 0; l < 3; ++l)
                            set.add(grid[3 * i + k][3 * j + l]);
                    if (set.size() != 9) {
                        result = false;
                        break;
                    }
                }
            if (result) sb.append("Case " + Integer.toString(n) + ": CORRECT\n");
            else sb.append("Case " + Integer.toString(n) + ": INCORRECT\n");
            if (n != t) br.readLine();
        }
        System.out.println(sb);
        br.close();
    }
}