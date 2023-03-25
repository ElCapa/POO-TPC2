import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {
        // alinha a)
        System.out.println("alinha a)");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.println(c);
            }
        }

        // alinha b)
        System.out.println("alinha b)");
        System.out.print("Digite uma string: ");
        String st = sc.nextLine();
        for (int i = 1; i < st.length(); i += 2) {
            char c = st.charAt(i);
            System.out.println(c);
        }

        // alinha c)
        System.out.println("alinha c)");
        System.out.print("Digite uma string: ");
        String str1 = sc.nextLine();
        str1 = str1.replaceAll("[AEIOUaeiou]", "_");
        System.out.println(str1);

        // alinha d)
        System.out.println("alinha d)");
        System.out.print("Digite uma string: ");
        String str2 = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println("Número de vogais: " + count);

        // alinha e)
        System.out.println("alinha e)");
        System.out.print("Digite uma string: ");
        String str3 = sc.nextLine();
        sc.close();
        System.out.print("Posições das vogais: ");
        for (int i = 0; i < str3.length(); i++) {
            char c = str3.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) {
                System.out.print(i + " ");
            }
        }
    }
}