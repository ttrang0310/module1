Cho đồ thị vô hướng G= được biểu diễn dưới dạng danh sách cạnh. Hãy tìm đường đi từ đỉnh s đến tất cả các đỉnh còn lại bằng thuật toán BFS.
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;

import java.util.*;

/**
 *
 * @author nguye_mmb9c7k
 */
public class DuongDiCoHuong {

    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static int truoc[] = new int[1001];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            int s = in.nextInt();
            for (int i = 0; i <= n; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
                truoc[i] = 0;
            }
            for (int i = 1; i <= m; i++) {
                int u = in.nextInt(), v = in.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            bfs(s);
            for (int i = 1; i <= n; i++) {
                if (chuaxet[i]) {
                    System.out.println("No path");
                } else {
                    ArrayList<Integer> kq = new ArrayList<>();
                    int x = i;
                    while (x != s) {
                        kq.add(x);
                        x = truoc[x];
                    }
                   // if (i != s) {
                        kq.add(s);
                        if(kq.size()==1){
                            continue;
                        }
                        Collections.reverse(kq);
                        for (Integer tmp : kq) {
                            System.out.print(tmp + " ");
                        }
                        System.out.println();
                    //}
                }
            }
        }

    }

    public static void bfs(int u) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        chuaxet[u] = false;
        while (!q.isEmpty()) {
            int y = q.poll();
            for (Integer x : dske[y]) {
                if (chuaxet[x]) {
                    q.add(x);
                    truoc[x] = y;
                    chuaxet[x] = false;
                }
            }
        }

    }
}