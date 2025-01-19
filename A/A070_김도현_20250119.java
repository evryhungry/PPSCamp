import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/2164
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] queue = new int[N * 2];
        for(int i = 1; i <= N; i++) {
            queue[i] = i;
        }

        int prev = 1;
        int last = N;

        while(N --> 1){
            prev++;
            queue[last + 1] = queue[prev];

            prev++;
            last++;
        }

        System.out.println(queue[last]);
    }

}
