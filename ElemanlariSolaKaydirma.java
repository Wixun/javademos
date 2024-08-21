public class Main {
    public static void main(String[] args) {
        int[] listem = {11, 13, 17, 1, 14, 84, 96, 23, 76, 47, 71, 81};

        int temp = listem[0];  // İlk elemanı sakla.

        // Elemanları sola kaydır.
        for (int i = 1; i < listem.length; i++) {
            listem[i - 1] = listem[i];
        }

        listem[listem.length - 1] = temp;  // İlk elemanı en sona koy.

        // Diziyi yazdır.
        for (int i = 0; i < listem.length; i++) {  // Dizinin tamamını yazdırın.
            System.out.print(listem[i] + " ");
        }
    }
}
