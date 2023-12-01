import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0;i < n;++i) arr1[i] = Integer.parseInt(st.nextToken());

        int j = 0;
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0;i < n;++i){
            arr2[i] = Integer.parseInt(st.nextToken());
            if (arr2[i] == arr1[0]) j = i;
        }

        int k = 0;
        int l = j-1,r = j+1;
        if (l == -1) l += n;
        if (r == n) r -= n;
        if (n > 1 && arr2[l] == arr1[1]) k = -1;
        if (n > 1 && arr2[r] == arr1[1]) k = 1;

        String result = "good puzzle";
        for (int i = 1;i < n;++i){
            j += k;
            if (j == n) j -= n;
            else if (j == -1) j += n;
            if (arr1[i] != arr2[j]) result = "bad puzzle";
        }
        System.out.println(result);
        br.close();
    }
}