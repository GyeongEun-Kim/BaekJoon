import java.io.*;
import java.util.Arrays;

public class No11656_접미사배열 {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int length = s.length();
        String arr [] = new String[length];

        for (int i=0;i<length;i++) {
            arr[i]=s.substring(i,length);
            //System.out.println(arr[i]);
        }
        Arrays.sort(arr);

        for (String n : arr) {
            System.out.println(n);
        }

    }
}
