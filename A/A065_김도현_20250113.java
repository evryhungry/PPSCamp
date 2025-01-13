import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/11650
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] matrix = new int[n][2];

        StringTokenizer st ;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            matrix[i][0] = Integer.parseInt(st.nextToken());
            matrix[i][1] = Integer.parseInt(st.nextToken());
        }

        // https://sjh9708.tistory.com/198
        Arrays.sort(matrix, (m1, m2) -> {
            if (m1[0] == m2[0]){
                return m1[1] - m2[1];
            } else {
                return m1[0] - m2[0];
            }
        });

        for (int i = 0; i < n; i++) {
            bw.write(matrix[i][0] + " " + matrix[i][1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
