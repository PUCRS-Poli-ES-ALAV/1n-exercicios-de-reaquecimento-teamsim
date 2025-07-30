import java.util.Scanner;
import java.util.InputMismatchException;

public class III {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) throw new InputMismatchException();
        System.out.println(calculaSerieHarmonicaAteN(n));
    }

    public static double calculaSerieHarmonicaAteN(int n) {
        
        
        if (n == 0) {
            return 0.0;  
        }
        
        return calculaSerieHarmonicaAteN(n-1) + 1.0/n;
    }


}
