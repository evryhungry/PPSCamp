import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/3062
// 오타로 틀리지 말자...
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int t = Integer.parseInt(br.readLine());

        StringBuilder ans = new StringBuilder();
        String[] numbers = new String[2];

        for(int i = 0; i < t; i++) {
            numbers[0] = br.readLine();
            StringBuilder reverse_n = new StringBuilder(numbers[0]);
            numbers[1] = reverse_n.reverse().toString();

            int sum = Integer.parseInt(numbers[1]) + Integer.parseInt(numbers[0]);
            if(isPalindrome(sum)) ans.append("YES").append("\n");
            else ans.append("NO").append("\n");
        }
        bw.write(ans.toString());
        bw.flush();
    }

    static boolean isPalindrome(int n){
        String number = String.valueOf(n);
        int mid = number.length() / 2;

        for (int i = 0 ; i < mid ; i++) {
            if(number.charAt(i) != number.charAt(number.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
