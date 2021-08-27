import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class No2231_분해합 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        Map<Integer, Integer> M = new HashMap<>();// 분해합 저장

        for (int i=1;i<=1000000;i++) {
            Integer bsum = i;

            String z = bsum.toString();
            for (int j=0;j<z.length();j++) {
                bsum += z.charAt(j)-'0';

            }

            if (M.get(bsum)==null)
                M.put(bsum, i);


        }

        if (M.get(Integer.parseInt(N))!= null)
            System.out.println(M.get(Integer.parseInt(N)));
        else
            System.out.println(0);
    }
}
