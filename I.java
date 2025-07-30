import java.util.InputMismatchException;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num_a =  scanner.nextInt();
        int num_b = scanner.nextInt();
        System.out.println(multiplicaPorSoma(num_a, num_b));
    }

    public static int multiplicaPorSoma(int num_a, int num_b) {
        
        if (num_a < 0 || num_b < 0) {
            throw new InputMismatchException();
        }

        if (num_a < num_b) {
            int aux = num_a;
            num_a = num_b;
            num_b = aux;
        }

        

        return multiplicaRecursivo(num_a,num_b);
    }

    
    public static int multiplicaRecursivo(int num_a, int num_b) {

        if (num_b == 0) {
            return 0;
        }

        return multiplicaRecursivo(num_a, num_b - 1) + num_a;
    }
        
}