public class Main {

    // Dizi Oluştur metodu
    public static int[] DiziOlustur(int min1, int max1, int min2, int max2) {
        int[] dizi = new int[6]; // 6 elemanlı dizi

        for (int i = 0; i < dizi.length; i++) {
            // 0-10 aralığından rastgele bir sayı üret
            int rastgeleSayi1 = (int) (min1 + Math.random() * (max1 - min1 + 1));
            // 50-100 aralığından rastgele bir sayı üret
            int rastgeleSayi2 = (int) (min2 + Math.random() * (max2 - min2 + 1));

            // Dizinin elemanları, iki aralıktan seçilen rastgele sayılardan oluşur
            dizi[i] = i % 2 == 0 ? rastgeleSayi1 : rastgeleSayi2; // Tek-çift indeksine göre sayı ekle
        }

        return dizi;
    }

    // Max Bul metodu
    public static int MaxBul(int[] dizi) {
        int max = dizi[0]; // İlk elemanı en büyük olarak başlat

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > max) {
                max = dizi[i]; // Daha büyük bir sayı bulunduysa güncelle
            }
        }

        return max; // En büyük değeri döndür
    }

    public static void main(String[] args) {
        int[] dizi = DiziOlustur(0, 10, 50, 100); // Dizi oluşturma metodu çağır
        System.out.println("Oluşturulan dizi:");
        for (int sayi : dizi) {
            System.out.print(sayi + " ");
        }

        int enBuyuk = MaxBul(dizi); // Max bulma metodu çağır
        System.out.println("\nDizinin en büyük elemanı: " + enBuyuk);
    }
}
