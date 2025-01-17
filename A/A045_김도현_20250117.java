import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/1157
public class Main {

    // 첫 풀이!  틀림 시간 소요가 너무 오래걸리는 사유
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        String[] uniqueArray = Arrays.stream(s.split("")).distinct().toArray(String[]::new);

        String r = "";
        int answer = 0;
        boolean flag = false;

        for (String c : uniqueArray) {
            int a = s.length() - s.replace(c, "").length();

            if (a == answer) {
                flag = true;
                break;
            } else if (a > answer) {
                answer = a;
                r = c;
            }
        }

        if (flag) System.out.println("?");
        else System.out.println(r);
    }

    // 두번째 풀이 맞음 - ASCII code 사용!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();

        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

        int maxCount = 0;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == maxCount) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
