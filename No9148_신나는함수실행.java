import java.io.*;

public class No9148_신나는함수실행 {
    static int[][][] memo=new int[21][21][21];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp;
        String s[];

        while (!(temp=br.readLine()).equals("-1 -1 -1")) {
            s= temp.split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);

            System.out.println("w("+a+", "+b+", "+c+") = "+w(a,b,c));

        }
    }

    public static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        else if (a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20);
        }
        if (memo[a][b][c]==0) { //처음 방문
              if (a < b && b < c) {
                memo[a][b][c] =w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
                }
              else memo[a][b][c]= w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);

        }
        return memo[a][b][c];


    }
}
