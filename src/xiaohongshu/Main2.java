package xiaohongshu;

import java.util.Scanner;

public class Main2 {
	//暴利求解，只通过90
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if(n<=1 || m<1){
            System.out.println(1);
            return;
        }
        
        boolean[][] map = new boolean[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int child = scan.nextInt();
            int ask = scan.nextInt();
            map[child][ask] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n ; j++) { 
                if(map[i][j] ){
                    for (int k = j+1; k <= n; k++) {
                        if(map[i][k] && map[j][k]){
                            System.out.println(0);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(1);
    }
}
