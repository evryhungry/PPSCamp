import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/1302
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }

        int maxValue = Collections.max(map.values());
        String maxKey = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                if (maxKey == null || entry.getKey().compareTo(maxKey) < 0) {
                    maxKey = entry.getKey();
                }
            }
        }

        System.out.println(maxKey);
    }
}
