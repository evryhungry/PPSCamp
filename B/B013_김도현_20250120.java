import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/2251
public class Main {
    static int[] capa;
    static boolean[][][] visited;
    static Set<Integer> set;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        capa = new int[]{A, B, C};
        visited = new boolean[A + 1][B + 1][C + 1];
        set = new TreeSet<>(); // HashMap 이 안되는 이유 : 정렬 안해줌 ... 그래서 틀렸네.. 아잇.. 

        dfs(0, 0, C);

        StringBuilder sb = new StringBuilder();
        for (Integer answer : set) sb.append(answer).append(" ");

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    public static void dfs (int a, int b, int c){
        if (visited[a][b][c]) return;

        visited[a][b][c] = true;
        if (a == 0) set.add(c);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i!=j){
                    int[] next = pour(new int[]{a, b, c}, i, j);
                    dfs(next[0], next[1], next[2]);
                }
            }
        }
    }

    public static int[] pour (int[] corrent, int from, int to){
        int[] next = corrent.clone();
        int move = Math.min(corrent[from], capa[to] - corrent[to]); // 둘 중 작은 용량 만큼만 옮길 수 있음.
        next[from] -= move;
        next[to] += move;
        return next;
    }
}
