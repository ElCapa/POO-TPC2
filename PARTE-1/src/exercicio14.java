import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        int[] itensVendidos = new int[4];
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 6) {
            System.out.println("Selecione uma opção:");
            System.out.println("[1] – Sumo");
            System.out.println("[2] – Bolo");
            System.out.println("[3] – Chocolate");
            System.out.println("[4] – Batatas Fritas");
            System.out.println("[5] – Total a pagar");
            System.out.println("[6] - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Aqui está o seu Sumo.");
                    itensVendidos[0]++;
                    break;
                case 2:
                    System.out.println("Aqui está o seu Bolo.");
                    itensVendidos[1]++;
                    break;
                case 3:
                    System.out.println("Aqui está o seu Chocolate.");
                    itensVendidos[2]++;
                    break;
                case 4:
                    System.out.println("Aqui estão suas Batatas Fritas.");
                    itensVendidos[3]++;
                    break;
                case 5:
                    System.out.println("Total a pagar:");
                    System.out.println(itensVendidos[0] + " itens Sumo vendido");
                    System.out.println(itensVendidos[1] + " itens Bolo vendido");
                    System.out.println(itensVendidos[2] + " itens Chocolate vendido");
                    System.out.println(itensVendidos[3] + " itens Batatas Fritas vendido");
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Erro. Escolha uma opção de 1 a 6.");
                    break;
            }
        }
    }
}