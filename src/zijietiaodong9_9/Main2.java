package zijietiaodong9_9;

import java.util.*;
public class Main2 {
    private static int M;
    private static int P = 0;
    private static int[][] hahaha= {{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        M = in.nextInt(); in.nextLine();
        int[][] matrix = new int[M][M];
        boolean[][] hasPassedBy = new boolean[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++)
                matrix[i][j] = in.nextInt();
            in.nextLine();
        }
        for (int i = 0; i < M; i++)
            for (int j = 0; j < M; j++)
                if (!hasPassedBy[i][j] && matrix[i][j] == 1) {
                    DFS(matrix, hasPassedBy, i, j);
                    P++;
                }
        System.out.println(P);
    }
    private static void DFS(int[][] matrix,boolean[][] hasPassedBy,int i, int j){
        if (i >= M || i < 0 || j >= M || j < 0)
            return;
        else if (matrix[i][j] == 0 || hasPassedBy[i][j])
            return;
        else {
            hasPassedBy[i][j] = true;
        }
        for (int k = 0; k < hahaha.length;k++){
            DFS(matrix,hasPassedBy,i + hahaha[k][0],j + hahaha[k][1]);
        }
    }
}
