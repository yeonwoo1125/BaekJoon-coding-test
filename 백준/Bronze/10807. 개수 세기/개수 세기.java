import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(st.hasMoreTokens()){
            if(v == Integer.parseInt(st.nextToken())) cnt++;
        }
        System.out.println(cnt);
        
    }
}