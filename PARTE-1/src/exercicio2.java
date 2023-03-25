import java.util.Scanner;
public class exercicio2 {

    public static void main(String[] args) {
        // alinha a)
        int s = 0;
        for (int i = 2; i <= 100; i += 2) {
            s += i;
        }
        System.out.println("A soma dos números pares entre 2 e 100 é " + s);
        // alinha b)
        int s1 = 0;
        for(int i=1; i<=100; i++) {
            s1 += i*i;
        }
        System.out.println("A soma de todos os quadrados entre 1 e 100 é " + s1);
        // alinha c)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();
        int s2 = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                s2 += i;
            }
        }
        System.out.println("A soma de todos os números ímpares entre " + a + " e " + b + " é " + s2);
        // alinha d)
        int n = 32677;
        int s3 = 0;
        while(n > 0) {
            int digito = n % 10;
            if(digito % 2 != 0) {
                s3 += digito;
            }
            n /= 10;
        }
        System.out.println("A soma de todos os dígitos ímpares de n é " + s3);
    }
}