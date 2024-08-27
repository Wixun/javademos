public class Main {
    public static void main(String[] args) {
        int dizi[][] = {{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}};
        int aranan = 6;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (aranan == dizi[i][j]) {
                    System.out.println("Aranan " + aranan + " bulundu: [" + i + "][" + j + "]");
                }
            }
        }
    }
}
