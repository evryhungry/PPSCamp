import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/10814
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] s = new String[n][2];

        for (int i = 0; i < n; i++) {
            String[] tokens =  br.readLine().split(" ");
            s[i][0] = tokens[0];
            s[i][1] = tokens[1];
        }

        Arrays.sort(s, Comparator.comparing(arr -> Integer.parseInt(arr[0])));

        for (String[] arr : s) {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}
