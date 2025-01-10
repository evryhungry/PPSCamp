import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/4344
public class Main {
    static int n;
    static int person;
    static int[] scores;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            person = Integer.parseInt(st.nextToken());
            scores = new int[person];
            for (int j = 0; j < person; j++) {
                if (st.hasMoreTokens()) {
                    scores[j] = Integer.parseInt(st.nextToken());
                }
            }

            double average = calculateAverage();
            bw.write(String.format("%.3f%%\n", checkOverAverage(average)));
        }

        bw.flush();
        bw.close();
    }

    public static double calculateAverage() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static float checkOverAverage(double average) {
        int count = 0;
        for (int score : scores) {
            if (score > average) count++;
        }
        return (float) count / scores.length * 100;
    }
}
