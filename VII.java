public class VII {
    public static void main(String[] args) {
        
        int[] numeros_inteiros = new int[args.length];
        
        for (int i = 0; i < args.length; i++) {
            numeros_inteiros[i] = Integer.parseInt(args[i]);
        }

        System.out.println(somaElementosDeArrayDeInteiros(numeros_inteiros, numeros_inteiros.length - 1));
        System.out.println(produtoElementosArrayDeInteiros(numeros_inteiros, numeros_inteiros.length - 1));
    }

    public static int somaElementosDeArrayDeInteiros(int[] numeros_inteiros, int size) {
        if (size == -1) {
            return 0;
        }
        return somaElementosDeArrayDeInteiros(numeros_inteiros, size - 1) + numeros_inteiros[size];
    }

    public static int produtoElementosArrayDeInteiros(int[] numeros_inteiros, int size) {
        if (size == -1) {
            return 1;
        }
        return produtoElementosArrayDeInteiros(numeros_inteiros, size - 1) * numeros_inteiros[size];
    }
}
