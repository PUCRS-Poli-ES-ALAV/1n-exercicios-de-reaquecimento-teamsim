import java.util.Scanner;
import java.util.ArrayList;

public class IX {
    private static int count = 0;
    private static final String[] leters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                                    "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        imprimeTodasCombinacoesDeNLetrasAlfabeto(n);
        System.out.println(count);
    }
    public static void imprimeTodasCombinacoesDeNLetrasAlfabeto(int n) {
        int camada = 0;
        ArrayList<Integer> letras_usadas = new ArrayList<>();
        String combinacao = "";
        pesquisa(n, camada, combinacao, letras_usadas);
    }
    
    public static void pesquisa(int n, int camada, String combinacao, ArrayList<Integer> letras_usadas) {
        if (camada == n) {
            count++;
            System.out.println(combinacao);
            return;
        }

        for (Integer i = 0; i < n; i++) {
            if (!letras_usadas.contains(i)) {
                combinacao += leters[i];
                letras_usadas.add(i);
                pesquisa(n, camada + 1, combinacao, letras_usadas);
                letras_usadas.remove(i);
                combinacao = combinacao.substring(0, combinacao.length() - 1);
                if (letras_usadas.size() + 1 == n) {
                    return;
                }
            }
        }
        return;
    }
}