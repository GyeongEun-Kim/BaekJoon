import java.io.*;

public class No9461_파도반수열 {
    static long[] memo;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int n;

        for (int i=0;i<tc;i++) {
            n = Integer.parseInt(br.readLine());
            memo = new long[101];
            memo[1]=1;
            memo[2]=1;
            memo[3]=1;
            memo[4]=2;
            memo[5]=2;

            System.out.println(dp(n));
        }
    }

    public static long dp (long n) {
        if (memo[(int) n]==0) { //처음방문
            return memo[(int) n]=dp(n-1)+dp(n-5);
        }
        else
            return memo[(int) n];
    }
}
