import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] products = new int[n];
        for (int i=0;i<n;i++)
            products[i] = Integer.parseInt(br.readLine());
        br.close();

        Arrays.sort(products);
        int result = 0;
        for (int i=1;i<=n;++i)
            if (i%3!=0)
                result += products[n-i];
        System.out.println(result);
    }
}