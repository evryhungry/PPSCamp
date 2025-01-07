import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Node{
        int num;
        Node leftnode;
        Node rightnode;

        Node(int num) {
            this.num = num;
        }

        void insert(int n){
            if (n < this.num){
                if (this.leftnode == null){
                    this.leftnode = new Node(n);
                } else this.leftnode.insert(n);
            } else {
                if (this.rightnode == null){
                    this.rightnode = new Node(n);
                } else this.rightnode.insert(n);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Node node = new Node(Integer.parseInt(br.readLine()));
        while (true){
            String str = br.readLine();
            if (str == null || str.isEmpty()) break;
            node.insert(Integer.parseInt(str));
        }

        postOrder(node);
    }

    static void postOrder(Node root){
        if (root == null) return;

        postOrder(root.leftnode);
        postOrder(root.rightnode);
        System.out.println(root.num);
    }
}
