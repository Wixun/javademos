import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dizi = {1, 4, 3, 4, 5, 3};
        System.out.println("Aranan sayiyi giriniz: ");
        int aranan = scan.nextInt();

        int[] bulunanIndisler = degerbulma(dizi, aranan);

        if (bulunanIndisler.length == 0) {
            System.out.println("Aranan sayi bulunamadi.");
        } else {
            System.out.print("Aranan sayinin bulundugu indeksler: ");
            for (int i : bulunanIndisler) {
                System.out.print(i + " ");
            }
        }
    }

    public static int[] degerbulma(int dizi[], int aranan) {
        int sayac = 0;

        // Önce aranan değerin kaç kez geçtiğini sayalım
        for (int i = 0; i < dizi.length; i++) {
            if (aranan == dizi[i]) {
                sayac++;
            }
        }

        // Aranan değerin bulunduğu indeksleri saklamak için bir dizi oluşturalım
        int[] bulunanIndisler = new int[sayac];
        int indeks = 0;

        // Tekrar bu indeksleri dizimize ekleyelim
        for (int i = 0; i < dizi.length; i++) {
            if (aranan == dizi[i]) {
                bulunanIndisler[indeks] = i;
                indeks++;
            }
        }

        return bulunanIndisler;
    }
}
