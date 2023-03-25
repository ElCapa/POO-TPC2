public class exercicio9 {
    public static void main(String[] args) {
        // alinha a)
        System.out.println("alinha a)");
        int[] array = {1, 2, 3, 4, 5};
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }System.out.println();

        // alinha b)
        System.out.println("alinha b)");
        int produto = 1;
        for (int elemento : array) {
            produto *= elemento;
        }
        System.out.println("Produto: " + produto);

        // alinha c)
        System.out.println("alinha c)");
        int[] arrays = {-1, 2, -3, 4, 5, -6};
        int contador = 0;
        for (int elemento : arrays) {
            if (elemento < 0) {
                contador++;
            }
        }
        System.out.println("Quantidade de números negativos: " + contador);
    }
}
