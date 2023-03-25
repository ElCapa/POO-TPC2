public class exercicio1 {
    public static void main(String[] args) {
        // alinha a)
        int n = 100;
        int i = 0;
        while (i*i < n) {
            System.out.print(i*i + " ");
            i++;
        }

        System.out.println();

        // alinha b)
        int n1 = 100;
        int i1 = 10;
        while (i1 < n1) {
            System.out.print(i1 + " ");
            i1 += 10;
        }

        System.out.println();

        // alinha c)
        int n2 = 100;
        int i2 = 1;
        while (i2 < n) {
            System.out.print(i2 + " ");
            i2 *= 2;
        }
    }
}
