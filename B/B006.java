import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class Main {
    static int n, e, start;
    static List<List<Integer>> node = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n+1 ; i++) {
            node.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node.get(a).add(b);
            node.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(node.get(i));
        }

        visited = new boolean[n + 1];
        dfs(start, bw);
        bw.write("\n");

        visited = new boolean[n + 1];
        bfs(start, bw);

        bw.flush();
        bw.close();

    }

    public static void dfs(int s, BufferedWriter bw) throws IOException{
        visited[s] = true;
        bw.write(s + " ");

        for (Integer i : node.get(s)) {
            if (!visited[i]) {
                dfs(i, bw);
            }
        }
    }

    private static void bfs(int s, BufferedWriter bw) throws IOException{
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;
        bw.write(s + " ");

        while(!q.isEmpty()) {
            int current = q.poll();
            for (int neighbor : node.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                    bw.write(neighbor + " ");
                }
            }
        }

    }
}
