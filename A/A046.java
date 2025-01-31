import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/1159
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n < 5) System.out.println("PREDAJA");
        else {
            int[] list = new int[26];

            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                list[s.charAt(0) - 'a']++;
            }

            boolean found = false;
            for (int i = 0; i < 26; i++) {
                if (list[i] >= 5) {
                    bw.write((char) (i + 'a'));
                    found = true;
                }
            }

            if (!found) {
                bw.write("PREDAJA");
            }
        }

        bw.flush();
        bw.close();
    }
}
