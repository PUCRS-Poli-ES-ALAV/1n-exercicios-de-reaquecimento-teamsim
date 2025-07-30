import java.util.Scanner;

public class Tarefa6 {
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num_a =  scanner.nextInt();
        int num_b = scanner.nextInt();
        System.out.println(sequenciaDeAckerman(num_a,num_b));
    }

    public static int sequenciaDeAckerman(int m, int n)
    {
        if (m == 0) return n+1;

        if (n == 0) return sequenciaDeAckerman(m-1, 1);

        return sequenciaDeAckerman(m-1, sequenciaDeAckerman(m, n-1));
    }

}
