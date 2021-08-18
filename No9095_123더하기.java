import java.io.*;

public class No9095_123더하기 {
    static int memo[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        memo = new int[12];
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;

        for (int i = 4; i <= 11; i++) {
            memo[i] = memo[i - 3] + memo[i - 2] + memo[i - 1];
        }

        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(memo[n]);
        }

    }
}

