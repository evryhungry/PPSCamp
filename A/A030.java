import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/17211
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        double m = Integer.parseInt(st.nextToken());

        double[] arr = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        m = 1000 * (1 - m);
        for (int i = 0; i < n; i++) m = (m * arr[0]) + ((1000 - m) * arr[2]);


        System.out.printf("%d\n%d", (int) m, (int) (1000 - m));
    }
}
