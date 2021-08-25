import java.io.*;

public class No2798_블랙잭 {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp[] = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        int card[] = new int[N];

        temp= br.readLine().split(" ");

        for (int i=0;i<N;i++) {
            card[i]=Integer.parseInt(temp[i]);
        }


        int max=0;
        for (int i=0;i<N-2;i++) {
            for (int j=i+1;j<N-1;j++) {
                for (int r=j+1;r<N;r++) {
                    int s = card[i] + card[j] + card[r];
                    if (s <=M && s >=max) {
                        max= s;
                        //System.out.println(sum);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
