import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[6];
        for (int i = 0;i < 6;++i)
            arr[i] = Integer.parseInt(st.nextToken());
        int result = arr[3];
        while (result < 1000000000){
            if (result % arr[1] == arr[4] && result % arr[2] == arr[5]) break;
            result += arr[0];
        }
        System.out.println((result < 1000000000) ? result : -1);
        br.close();
    }
}