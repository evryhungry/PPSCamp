import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/3135
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        int min = Math.abs(a - b);

        for (int i = 0; i < n; i++){
            int k = Integer.parseInt(br.readLine());
            min = Math.min(min, Math.abs(k - b) + 1);
        }
        System.out.println(min);
    }
}
