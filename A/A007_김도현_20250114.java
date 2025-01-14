import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/2920
public class Main {
    static Integer[] scale;
    static Integer[] comparator;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        scale = new Integer[8];
        comparator = new Integer[8];

        for (int i = 0; i < 8; i++) {
            scale[i] = Integer.parseInt(st.nextToken());
            comparator[i] = i + 1;
        }

        Integer[] comparatorDescending = Arrays.copyOf(comparator, comparator.length);
        Arrays.sort(comparatorDescending, Collections.reverseOrder());

        if (Arrays.equals(scale, comparator)) {
            System.out.println("ascending");
        } else if (Arrays.equals(scale, comparatorDescending)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
