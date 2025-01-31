import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/1292
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; cnt < 1000; i++) {
            for (int j = 0; j < i && cnt < 1000; j++) {
                list.add(i);
                cnt++;
            }
        }

        cnt = 0;
        for (int i = a - 1 ; i < b; i++){
            cnt += list.get(i);
        }
        bw.write(cnt + "\n");
        bw.flush();
    }

}
