import java.util.Scanner;
import java.util.InputMismatchException;

public class V {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(geraSequenciaDada(n));
    }

    public static int geraSequenciaDada(int n) {
        if (n <= 0) {
            throw new InputMismatchException();
        }

        if (n == 1 || n == 2) {
            return n;
        }

        return 2 * geraSequenciaDada(n - 1) + 3 * geraSequenciaDada(n - 2);

    }
}
