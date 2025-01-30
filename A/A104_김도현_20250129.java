import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/14487
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] k = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(k);
        int sum = 0;
        for (int i = 0; i < n - 1; i++) sum += k[i];

        System.out.println(sum);
    }
}
