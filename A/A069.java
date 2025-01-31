import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/11866
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        int k = 0;
        while(!list.isEmpty()){
            k = (k + m - 1) % list.size();

            sb.append(list.remove(k));
            if (!list.isEmpty()) {
                sb.append(", ");
            }
        }

        bw.write("<" + sb.toString() + ">\n");
        bw.flush();
        bw.close();
    }
}
