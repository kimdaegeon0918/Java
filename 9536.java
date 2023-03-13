import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i=0;i<t;i++)
        {
            ArrayList<String> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine()," ");
            while (st.hasMoreTokens())
                list.add(st.nextToken());

            while (true)
            {
                st = new StringTokenizer(br.readLine()," ");
                st.nextToken();
                if (st.nextToken().equals("does")) break;
                String a = st.nextToken();
                for (int j=0;j<list.size();j++)
                    if (list.get(j).equals(a))
                    {
                        list.remove(j);
                        j--;
                    }
            }
            for (int j=0;j<list.size();j++)
                sb.append(list.get(j) + ' ');
            sb.append('\n');
        }
        br.close();
        System.out.println(sb);
    }
}