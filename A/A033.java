import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    static int sum;
    static int max;
    static int human;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        max = -1;
        human = -1;

        for (int idx = 1; idx < 6; idx++) {
            sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            if (max < sum) {
                max = sum;
                human = idx;
            }
        }

        bw.write(human + " " + max + "\n");
        bw.flush();
        br.close();
    }
}