import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/1431
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        Collections.sort(list, Main::compare);

        for (int i = 0; i < n; i++) System.out.println(list.get(i));
    }

    public static int compare(String s1, String s2) {
        if(s1.length() != s2.length()) return s1.length() - s2.length();
        else {
            int sum1 = 0;
            int sum2 = 0;
            for (char c : s1.toCharArray()) {
                if(c <= '9' && c >= '0') {
                    sum1 += c - '0';
                }
            }
            for (char c : s2.toCharArray()) {
                if(c <= '9' && c >= '0') {
                    sum2 += c - '0';
                }
            }

            if (sum1 > sum2) return 1;
            else if (sum1 < sum2) return -1;
            else return s1.compareTo(s2);
        }
    }
}
