import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/1065
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());
        int count = 0;
        int check = 100;

        if (k < 100) bw.write(k + "\n");
        else {
            count = 99;
            while(check <= k){
                if ((check / 100 - (check / 10) % 10) == ((check / 10) % 10 - check % 10)){
                    count++;
                }
                check++;
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}
