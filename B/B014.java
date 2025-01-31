import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// https://www.acmicpc.net/problem/4963
public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int x;
    static int y;
    static int dx[] = {0, 0, -1, 1, -1, 1, -1, 1};
    static int dy[] = {-1, 1, 0, 0, 1, 1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String s = "";
        while(!(s = br.readLine()).equals("0 0")){
            st = new StringTokenizer(s);
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            arr = new int[y][x];
            visited = new boolean[y][x];

            for(int i = 0; i < y; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < x; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;

            for(int h = 0; h < y; h++){
                for(int w = 0; w < x; w++){
                    if (arr[h][w] == 1 && !visited[h][w]){
                        dfs(h, w);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs (int h, int w){
        visited[h][w] = true;

        for(int i = 0 ; i < 8; i++){
            int nowX = w + dx[i];
            int nowY = h + dy[i];

            if (nowX >= 0 && nowY >= 0 && nowX < x && nowY < y){
                if(!visited[nowY][nowX] && arr[nowY][nowX] == 1){
                    dfs(nowY, nowX);
                }
            }
        }
    }
}
