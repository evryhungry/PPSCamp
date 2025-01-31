import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            float result = 0.0f;
            boolean firstNumber = false;

            for (String token : tokens) {
                if (token.matches("\\d+(\\.\\d+)?")) {
                    result = Float.parseFloat(token);
                    firstNumber = true;
                } else if (firstNumber) {
                    for (char c : token.toCharArray()) {
                        switch (c) {
                            case '@':
                                result *= 3;
                                break;
                            case '%':
                                result += 5;
                                break;
                            case '#':
                                result -= 7;
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
            bw.write(String.format("%.2f\n",result));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
