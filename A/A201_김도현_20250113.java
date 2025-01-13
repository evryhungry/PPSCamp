import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/17413
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(char c : s.toCharArray()) {
            if (c == '<'){
                flag = false;
                if (!stack.isEmpty()){
                    while (!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                }
                sb.append(c);
            } else if (c == '>'){
                flag = true;
                sb.append(c);
            } else if (flag){
                if (c == ' '){
                    if (!stack.isEmpty()){
                        while (!stack.isEmpty()){
                            sb.append(stack.pop());
                        }
                    }
                    sb.append(c);
                } else {
                    stack.push(c);
                }
            } else {
                sb.append(c);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }


        bw.write(sb.toString() + "\n");
        bw.flush();

    }
}
