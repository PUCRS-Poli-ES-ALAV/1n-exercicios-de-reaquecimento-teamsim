import java.util.Scanner;


public class Tarefa8 {
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String str_a =  scanner.nextLine();
        System.out.println(isPalindromo(str_a));
    }

    public static boolean isPalindromo(String s)
    {
        if (s.length() == 0 || s.length() == 1)
        {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length()-1)) return false;

        return isPalindromo(s.substring(1, s.length()-1));

    }

}
