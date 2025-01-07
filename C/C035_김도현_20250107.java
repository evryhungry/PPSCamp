import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static long result;
    static List<List<Integer>> point = new ArrayList<>();
    static HashMap<Integer, Long> xCount = new HashMap<>();
    static HashMap<Integer, Long> yCount = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            point.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            point.get(i).add(x);
            point.get(i).add(y);

            xCount.put(x, xCount.getOrDefault(x, 0L) + 1);
            yCount.put(y, yCount.getOrDefault(y, 0L) + 1);
        }

        for (int i = 0; i < n; i++) {
            int x = point.get(i).get(0);
            int y = point.get(i).get(1);

            result += (xCount.get(x) - 1) * (yCount.get(y) - 1);
        }

        System.out.println(result);
    }
}
