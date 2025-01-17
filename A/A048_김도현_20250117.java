import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/1316
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int[] list = new int[26];
            boolean flag = true;
            list[s.charAt(0)-'a'] = 1;

            if (s.length() == 1) count++;
            else {
                for (int j = 1; j < s.length(); j++) {
                    if (s.charAt(j) == s.charAt(j - 1)) list[s.charAt(j) - 'a']++;
                    else {
                        if (list[s.charAt(j) - 'a'] >= 1){
                            flag = false;
                            break;
                        } else list[s.charAt(j) - 'a']++;
                    }
                }

                if (flag) count++;
            }
        }

        System.out.println(count);
    }
}
