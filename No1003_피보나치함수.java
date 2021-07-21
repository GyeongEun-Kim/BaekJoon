import java.io.*;

public class No1003_피보나치함수 {

    static int memo[][] = new int[41][2];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i=0;i<41;i++) {
            for (int j=0;j<2;j++) {
                memo[i][j]=-1;
            }
        }//메모가 안된 배열은 -1로 초기화되어있음

        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            fib(n);
            System.out.println(memo[n][0]+" "+memo[n][1]);
        }
    }

    public static int[] fib(int n) {
        if (memo[n][0] == -1 || memo[n][1] == -1) { // 처음 구하는 값
            if (n == 0) {
                memo[n][0]=1;
                memo[n][1]=0;
            }
            else if (n == 1) {
                memo[n][1]=1;
                memo[n][0]=0;

            }
            else {
                memo[n][0] = fib(n - 2)[0] + fib(n - 1)[0];
                memo[n][1] = fib(n - 2)[1] + fib(n - 1)[1];
            }
        }
        return memo[n];
    }
}



