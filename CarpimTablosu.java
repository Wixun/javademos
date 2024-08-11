public class Main {
    public static void main(String[] args) {
        int i, j;
        System.out.println("CARPIM TABLOSU");
        System.out.print(" ");

        for (i = 1; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n--------------------------------------------------");
        for (int k = 1; k < 10; k++) {
            System.out.print(k + "|");
            for (int l = 1; l < 10; l++) {
                System.out.printf("%4d", k * l);
            }
            System.out.println(" ");
        }
    }
}
