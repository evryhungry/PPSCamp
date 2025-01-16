import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/3052
public class Main {
    // list 사용 -> 불필요한 for 문 더 사용하게 됨
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++) list[Integer.parseInt(br.readLine()) % 42]++;
        for (int i = 0; i < 42; i++) if (list[i] > 0) count++;

        System.out.println(count);
    }
    // Hashmap 사용 -> 불필요한 for문없이 가능
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            set.add(n % 42);
        }

        System.out.println(set.size());
    }
    // 더 간경을 원하면 Arrays 라이브러리 사용가능. GPT가 해줌 와 멋지네..
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(
                Arrays.stream(br.lines().limit(10).mapToInt(Integer::parseInt).toArray())
                        .map(n -> n % 42)
                        .distinct()
                        .count());
    }
}
