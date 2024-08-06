import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = new int[5];
        int toplam = 0;

        // Kullanıcıdan 5 adet sayı alıyoruz.
        for (int i = 0; i < 5; i++) {
            System.out.println("Dizi [" + (i + 1) + "] elemanını giriniz: ");
            dizi[i] = input.nextInt();
        }

        // Dizideki elemanları topluyoruz.
        for (int i = 0; i < 5; i++) {
            toplam += dizi[i];
        }

        // Aritmetik ortalamayı hesaplayıp ekrana yazdırıyoruz.
        double ortalama = toplam / 5.0;
        System.out.println("Aritmetik Ortalama: " + ortalama);

    }
}
