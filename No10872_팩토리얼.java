import java.util.Scanner;

public class No10872_팩토리얼 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));

    }
    public static int factorial (int n) {
        if (n==0)
            return 1;
        else if (n==1)
            return n;
        else
            return n*factorial(n-1);
    }
}
