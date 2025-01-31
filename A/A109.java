import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/10834
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int rotation = 0;
        int cycle = 1;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (c == 1) rotation = 1 - rotation;
            cycle = cycle / a * b;

        }
        System.out.println(rotation + " " + cycle);
    }
}
