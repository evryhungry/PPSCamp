import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/1267
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Y = 0;
        int M = 0;


        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] tokens = s.split(" ");

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(tokens[i]);

            Y += 10 + (number / 30) * 10;
            M += 15 + (number / 60) * 15;
        }

        if (Y < M){
            bw.write("Y " + Y + "\n");
        } else if (M < Y){
            bw.write("M " + M + "\n");
        } else {
            bw.write("Y M " + Y + "\n");
        }
        bw.flush();
        bw.close();
    }
}
