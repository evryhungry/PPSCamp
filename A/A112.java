import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] com;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        com = new int[m][2];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            com[i][0] = a;
            com[i][1] = b;
        }

        int pack = Integer.MAX_VALUE;
        int piece = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            if (com[i][0] < pack) pack = com[i][0];
            if (com[i][1] < piece) piece = com[i][1];
        }

        int result = 0;

        if(piece * 6 <= pack)
            result = piece * n;
        else{
            result = (n/6) * pack;
            if(n%6 * piece <= pack)
                result += (n%6) * piece;
            else
                result += pack;
        }

        System.out.println(result);
    }
}
