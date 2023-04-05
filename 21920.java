import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main {
    private static int getGcd(int a, int b){
        if (b == 0) { return a; }
        else { return getGcd(b,a%b); }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[500000];
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0;i < n;++i) { arr[i] = Integer.parseInt(st.nextToken()); }
        int x = Integer.parseInt(br.readLine());

        long result = 0;
        int cnt = 0;
        for (int i : arr){
            if (getGcd(x,i) == 1){
                result += i;
                ++cnt;
            }
        }

        System.out.println((double)result/cnt);
        br.close();
    }
}