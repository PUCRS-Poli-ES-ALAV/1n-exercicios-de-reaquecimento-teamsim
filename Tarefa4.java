import java.util.Scanner;

public class Tarefa4 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String str_a =  scanner.nextLine();
        System.out.println(inverteString(str_a));
    }
    public static String inverteString(String s)
    {
        if (s.isEmpty())
        {
            return "";
        }
        return s.charAt(s.length()-1) + inverteString(s.substring(0, s.length()-1)); 
    }

}
