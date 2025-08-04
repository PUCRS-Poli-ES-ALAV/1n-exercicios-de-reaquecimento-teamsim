import java.util.Scanner;

public class Tarefa10 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num_a =  scanner.nextInt();
        int num_b = scanner.nextInt();
        int num_c = scanner.nextInt();
        System.out.println(fibonacciGeneralizado(num_a,num_b,num_c));
    }

    public static int fibonacciGeneralizado(int f0, int f1, int n)
    {
        if (n == 0)
        {
            return f0;
        }
        if (n == 1)
        {
            return f1;
        }
        return fibonacciGeneralizado(f0, f1, n-1) + fibonacciGeneralizado(f0, f1, n-2);

    }
}
