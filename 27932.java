import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int[] height = new int[n];
        for (int i = 0 ; i < n ; ++i)
            height[i] = Integer.parseInt(st.nextToken());
        if (n == 1){
            System.out.println(0);
            return;
        }

        int left = 0, right = (int)Math.pow(10,9);
        while (left <= right){
            int mid = (left+right)/2;
            int count = 0;
            for (int i = 0 ; i < n ; ++i){
                if (i == 0){
                    if (Math.abs(height[i]-height[i+1]) > mid) ++count;
                }
                else if (i == n-1){
                    if (Math.abs(height[i]-height[i-1]) > mid) ++count;
                }
                else if (Math.abs(height[i]-height[i+1]) > mid || Math.abs(height[i]-height[i-1]) > mid) ++count;
            }
            if (count > k)
                left = mid+1;
            else {
                right = mid-1;
            }
        }
        System.out.println(left);
        br.close();
    }
}