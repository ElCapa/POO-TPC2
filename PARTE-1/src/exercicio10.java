import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        // alinha a)
        System.out.println("alinha a)");
        int s = 0;
        for (int i = 2; i <= 100; i += 2) {
            s += i;
        }
        System.out.println("A soma dos números pares entre 2 e 100 é: " + s);

        // alinha b)
        System.out.println("alinha b)");
        int s1 = 0;
        for (int i = 1; i <= 100; i++) {
            s1 += i * i;
        }
        System.out.println("A soma dos quadrados entre 1 e 100 é: " + s1);

        // alinha c)
        System.out.println("alinha c)");
        for (int i = 0; i <= 20; i++) {
            int power = (int) Math.pow(2, i);
            System.out.println("2 elevado a " + i + " é igual a: " + power);
        }

        // alinha d)
        System.out.println("alinha d)");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("A soma dos números ímpares entre " + a + " e " + b + " é: " + sum);

        // alinha e)
        System.out.println("alinha e)");
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        int soma = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                soma += digit;
            }
            number /= 10;
        }
        System.out.println("A soma dos dígitos ímpares do número digitado é: " + soma);
    }
}