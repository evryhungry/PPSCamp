import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        HashMap<String, Integer> map = new HashMap<>();
        float sixNineChecker = 0;

        for (char c : n.toCharArray()) {
            if (c == '6' || c == '9') {
                sixNineChecker += 0.5;
                map.put("6/9", (int) Math.ceil(sixNineChecker));
            } else {
                map.put(c + "", map.getOrDefault(c + "", 0) + 1);
            }
        }
        System.out.println(Collections.max(map.values()));
    }
}
