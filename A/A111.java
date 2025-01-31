import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/9546
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(t --> 0){
            int k = Integer.parseInt(br.readLine());
            sb.append((1L << k) - 1 + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
