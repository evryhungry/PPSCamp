import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            input = st.nextToken();
            Stack<Character> stack = new Stack<>();
            Stack<Character> backStack = new Stack<>();

            for (char c : input.toCharArray()) {
                if (c == '<') {
                    if (!stack.isEmpty()) {
                        backStack.push(stack.pop());
                    }
                }
                else if (c == '>') {
                    if (!backStack.isEmpty()) {
                        stack.push(backStack.pop());
                    }
                }
                else if (c == '-'){
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
                else {
                    stack.push(c);
                }
            }

            while(!backStack.isEmpty()) {
                stack.push(backStack.pop());
            }

            StringBuffer result = new StringBuffer();
            while(!stack.isEmpty()) {
                result.append(stack.pop());
            }

            bw.write(result.reverse().toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
