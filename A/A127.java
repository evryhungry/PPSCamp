import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/1934
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            String s = br.readLine();
            int n = Integer.parseInt(s.split(" ")[0]);
            int m = Integer.parseInt(s.split(" ")[1]);

            int a = n;
            int b = m;
            int c = 0;

            while(a != 0){
                b = b%a;
                c = a;
                a = b;
                b = c;
            }

            System.out.println(n*m/b);
        }
    }
}
