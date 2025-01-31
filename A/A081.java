import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/2693
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int[] arr = new int[10];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            sb.append(arr[7]).append("\n");
        }

        System.out.print(sb);
    }
}