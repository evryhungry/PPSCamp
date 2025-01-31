import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/10867
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        int[] k = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < n; i++) set.add(k[i]);

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
    }
}
