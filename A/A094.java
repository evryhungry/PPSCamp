import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/2941
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] list = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
        String s = br.readLine();

        for (String str : list) {
            s = s.replace(str, "*");
        }

        System.out.println(s.length());
    }
}
