import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(pq.isEmpty()) System.out.println("0");
                else {
                    System.out.println(pq.poll());
                    
                }
            }
            else pq.add(num);
        }
    }
}