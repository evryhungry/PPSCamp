import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/3059
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            boolean[] isit = new boolean[26];

            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) isit[s.charAt(j) - 'A'] = true;

            int sum = 0;
            for (int j = 0; j < isit.length; j++) {
                if (!isit[j]) {
                    sum += j + 'A';
                }
            }

            sb.append(sum + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
