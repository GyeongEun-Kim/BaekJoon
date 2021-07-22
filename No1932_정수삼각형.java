import java.io.*;

public class No1932_정수삼각형 {
    static int tree[][] ;
    static int memo[][] ;
    static int n;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        tree= new int[n][n]; //입력받은 삼각형
        memo = new int [n][n]; //부분합을 저장할 이차원배열

        for (int i=0;i<n;i++) {
            String[] temp= br.readLine().split(" ");
            for (int j=0;j<=i;j++) {
                tree[i][j]=Integer.parseInt(temp[j]);
            }
        }

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                memo[i][j]=-1;
            }
        }

        memo[n-1] = tree[n-1]; //맨아랫줄 깔기

        System.out.println(dp(0,0));

    }
    public static int dp (int depth, int index) {
        if (depth== n-1) //맨마지막 줄까지 오면 그대로 tree값을 반환
            return memo[depth][index];
        if (memo[depth][index]==-1) {//처음 방문하면
            memo[depth][index]= Math.max(dp(depth+1,index),dp(depth+1,index+1)) + tree[depth][index];
        }
        return memo[depth][index];

    }
}
