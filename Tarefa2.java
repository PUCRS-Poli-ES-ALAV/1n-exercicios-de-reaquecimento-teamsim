import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarefa2{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num_a =  scanner.nextInt();
        int num_b = scanner.nextInt();
        System.out.println(somaNaturais(num_a, num_b));
    }

    public static int somaNaturais(int num_a, int num_b)
    {
        if (num_a < 0 || num_b < 0) {
            throw new InputMismatchException();
        }

        if (num_a < num_b) {
            int aux = num_a;
            num_a = num_b;
            num_b = aux;
        }

        return somaRecursivaInc(num_a, num_b);
    }

    public static int somaRecursivaInc(int num_a, int num_b)
    {
        if (num_b == 0)
        {
            return num_a;
        }

        return (somaRecursivaInc(num_a, num_b-1))+1;

    }
    
}
