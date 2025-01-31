import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/2775
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[] list = new int[n + 1];

            for (int j = 1; j <= n; j++) {
                list[j] = 1;
            }

            for (int j = 0 ; j <= k ; j++){
                for (int m = 1 ; m <= n ; m++){
                    list[m] += list[m - 1];
                }
            }

            System.out.println(list[n]);
        }

    }
}
