import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Taxa de nascimento de presas (A): ");
        double A = sc.nextDouble();

        System.out.print("Taxa de predação (B): ");
        double B = sc.nextDouble();

        System.out.print("Taxa de mortalidade de predadores (C): ");
        double C = sc.nextDouble();

        System.out.print("Taxa de aumento predador na presença de comida (D): ");
        double D = sc.nextDouble();

        System.out.print("Tamanho inicial da população de presas: ");
        int prey = sc.nextInt();

        System.out.print("Tamanho inicial da população de predadores: ");
        int predator = sc.nextInt();

        System.out.print("Número de períodos: ");
        int periods = sc.nextInt();

        for (int i = 1; i <= periods; i++) {
            int newPrey = (int) (prey * (1 + A - B * predator));
            int newPredator = (int) (predator * (1 - C + D * prey));

            System.out.println("Período " + i + ": " + newPrey + " presas, " + newPredator + " predadores");

            prey = newPrey;
            predator = newPredator;
        }
    }
}
