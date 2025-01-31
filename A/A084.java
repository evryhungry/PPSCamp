import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/11656
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.substring(i, s.length()));
        }

        list.sort(String::compareTo);

        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
    }
}
