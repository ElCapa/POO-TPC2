import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {
        // alinha a
        System.out.println("alinha a)");
        Scanner sc = new Scanner(System.in);
        int menor = 1000000000;
        int maior = -1000000000;

        System.out.println("Digite uma sequência de números inteiros (digite 0 para sair):");
        int num = sc.nextInt();

        while (num != 0) {
            if (num < menor) {
                menor = num;
            }
            if (num > maior) {
                maior = num;
            }
            num = sc.nextInt();
        }
        System.out.println("O menor número é " + menor + " e o maior número é " + maior + ".");

        // alinha b)
        System.out.println("alinha b)");
        int pares = 0;
        int impares = 0;

        System.out.println("Digite uma sequência de números inteiros (digite 0 para sair):");
        int n = sc.nextInt();

        while (n != 0) {
            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            n = sc.nextInt();
        }

        System.out.println("Foram digitados " + pares + " números pares e " + impares + " números ímpares.");

        // alinha c)
        System.out.println("alinha c)");
        int total = 0;

        System.out.println("Digite uma sequência de números inteiros (digite 0 para sair):");
        int n1 = sc.nextInt();
        while (n1 != 0) {
            total += n1;
            System.out.print(total + " ");
            n1 = sc.nextInt();
        }

        // alinha d)
        System.out.println("alinha d)");
        int anterior = 0;
        boolean primeiroLoop = true;

        System.out.print("Insira uma sequência de números inteiros (para terminar, digite um número não inteiro): ");
        while (sc.hasNextInt()) {
            int atual = sc.nextInt();
            if (primeiroLoop) {
                anterior = atual;
                primeiroLoop = false;
            } else if (atual == anterior) {
                System.out.print(atual + " ");
            }
            anterior = atual;
        }
    }
}
