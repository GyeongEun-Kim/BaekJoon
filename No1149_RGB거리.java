import java.io.*;

public class No1149_RGB거리 {
    static int cost[][]= new int[1001][1002];
    static int memo[][] = new int[1001][1002];
    static int N;
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); //집의 갯수
        String temp[];
        int min=0; //정답

        for (int i=1;i<=N;i++) {
            temp=br.readLine().split(" ");
            for (int j =1;j<=3;j++) {
                cost[i][j] = Integer.parseInt(temp[j-1]);
            }
        }

        memo[1]=cost[1];
//        System.out.println(memo[1][1]);
//        System.out.println(memo[1][2]);
//        System.out.println(memo[1][3]);

        for (int i=2;i<=N;i++) {
            for (int j=1;j<=3;j++) {
                if (j==1)
                    memo[i][j]=Math.min(cost[i][j]+memo[i-1][2],cost[i][j]+memo[i-1][3]);
                else if (j==2)
                    memo[i][j]=Math.min(cost[i][j]+memo[i-1][1],cost[i][j]+memo[i-1][3]);
                else if (j==3)
                    memo[i][j]=Math.min(cost[i][j]+memo[i-1][2],cost[i][j]+memo[i-1][1]);
            }
            if (i==N) {
                min = Math.min(memo[i][1],memo[i][2]);
                min = Math.min(min,memo[i][3]);
            }
        }

        System.out.println(min);


    }

}
