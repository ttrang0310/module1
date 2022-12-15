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
public class DFSdothivohuongtuDinh_n {
    static ArrayList<Integer> dske[]=new ArrayList[1001];
    static int check[]=new int[1001];
   
    public static void main(String[] args) {
      
    
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int dinh=sc.nextInt();
            int canh=sc.nextInt();
            int s=sc.nextInt();
            for(int i=0;i<=dinh;i++){
                dske[i]=new ArrayList<>();
                check[i]=1;
            }
            for(int i=0;i<canh;i++){
                int a= sc.nextInt();
                int b=sc.nextInt();
                dske[a].add(b); dske[b].add(a);
            }
            System.out.print("DFS("+s+") = ");
            DFS(s);
            System.out.println();
        }
    }
    public static void DFS(int u){
        Stack<Integer> st= new Stack<>();
        check[u]=0;
        System.out.print(u);
        for(int i=0;i<dske[u].size();i++){
            int y=dske[u].get(i);
            if(check[y]==1){
                System.out.print(" -> ");
                DFS(y);
            }
        }
    }
    
    
}
