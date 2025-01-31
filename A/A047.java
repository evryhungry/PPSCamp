import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/11721
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int maxIndex = 10;

        for (int i = 0; i < s.length(); i += maxIndex) {
            bw.write(s.substring(i, Math.min(i + maxIndex, s.length())) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
