import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/5585
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 1000 - Integer.parseInt(br.readLine());
        int[] en = {500, 100, 50, 10, 5, 1};

        int ans = 0;
        for (int i = 0; i < en.length; i++) {
            int cnt = N / en[i];
            if (cnt > 0) {
                ans += cnt;
                N -= cnt * en[i];
            }
        }
        System.out.println(ans);
    }
}
