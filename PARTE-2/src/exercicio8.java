import java.util.Random;
public class exercicio8 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random gerador = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = gerador.nextInt(100) + 1;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
