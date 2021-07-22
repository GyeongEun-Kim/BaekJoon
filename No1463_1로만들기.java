import java.util.Scanner;

public class No1463_1로만들기 {
    static int[] memo ;
    static int x;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        memo = new int[x+1];

        System.out.println(dp(x));
    }

    public static int dp (int n) {
        if (n==1) {
            //System.out.println(cnt);
            return 0;
        }
        if (memo[n]==0) {
            if (n % 6 == 0) { //2와 3으로 모두 나누어떨어짐
                memo[n] = Math.min(dp(n / 3) + 1, dp(n / 2)+ 1);
                return memo[n] =Math.min(memo[n],dp(n-1)+1);
            } else if (n % 3 == 0) { //3으로만
                return memo[n] = Math.min(dp(n / 3) +1, dp(n - 1)+ 1);
            } else if (n % 2 == 0) {//2로만
                return memo[n] = Math.min(dp(n / 2)+1, dp(n - 1)+1);
            }
            //-1
            return memo[n] = dp(n - 1)+1;
        }
        else {
            //System.out.println("memo"+n+": "+memo[n]);
            return memo[n];
        }

        }



}
