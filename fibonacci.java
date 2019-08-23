import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("\nEnter the number of terms: ");
        int n = inp.nextInt();

        startFibo(n);

        inp.close();

    }

    public static void startFibo(int n){
        for (int i=0;i<n;i++) {
            System.out.println(fibo(i));
        }
    }

    public static int fibo(int n){
        if (n<=1) {
          return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}