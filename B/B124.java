import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/2225
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int MOD = 1000000000;
        int[][] dp = new int[N + 1][M + 1];

        for (int i = 1; i <= M; i++) dp[0][i] = 1;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                dp[i][j] = (dp[i - 1][j] + (j > 1 ? dp[i][j - 1] : 0)) % MOD;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dp[N][M]).append("\n");

        bw.write(sb.toString());
        bw.flush();
    }
}
