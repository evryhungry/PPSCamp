import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class Main {
    public static int[] stack = new int[10001];
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            switch (s[0]) {
                case "push":
                    push((int) Integer.parseInt(s[1]));
                    break;
                case "pop":
                    bw.write(pop() + "\n");
                    break;
                case "size":
                    bw.write(size() + "\n");
                    break;
                case "empty":
                    bw.write(empty() + "\n");
                    break;
                case "top":
                    bw.write(top() + "\n");
                    break;
                default:
                    break;
            }
        }
        bw.flush();
        bw.close();
    }

    public static void push(int x) {
        stack[size] = x;
        size++;
    }

    public static int pop() {
        if (size == 0) return -1;
        return stack[--size];
    }

    public static int size(){
        return size;
    }

    public static int empty(){
        return size == 0 ? 1 : 0;
    }

    public static int top(){
        if (size == 0) return -1;
        return stack[size - 1];
    }
}
