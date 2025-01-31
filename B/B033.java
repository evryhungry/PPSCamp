import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/10162
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a, b, c;

        if( n % 10 != 0) bw.write("-1\n");
        else {
            a = n / 300;
            b = (n % 300) / 60;
            c = ((n % 300) % 60) / 10;
            bw.write(a + " " + b + " " + c + "\n");
        }
        bw.flush();
        bw.close();
    }
}
