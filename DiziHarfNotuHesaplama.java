import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int vizeNotu, finalNotu;
        double notOrtalamasi;
        String[] ogrenciler = {"Eren", "Yusuf", "Sercan", "Emirhan"};
        String[] ogrenciBilgileri = new String[ogrenciler.length];
        Random random = new Random();

        for (int i = 0; i < ogrenciler.length; i++) {
            vizeNotu = random.nextInt(100) + 1; // 1 ile 100 arasında rastgele bir sayı üretir.
            finalNotu = random.nextInt(100) + 1;
            notOrtalamasi = (vizeNotu * 0.4) + (finalNotu * 0.6);

            // Harf notunu belirleme
            String harfNotu;
            if (notOrtalamasi >= 90) {
                harfNotu = "AA";
            } else if (notOrtalamasi >= 80) {
                harfNotu = "BA";
            } else if (notOrtalamasi >= 70) {
                harfNotu = "BB";
            } else if (notOrtalamasi >= 60) {
                harfNotu = "CB";
            } else if (notOrtalamasi >= 50) {
                harfNotu = "CC";
            } else if (notOrtalamasi >= 40) {
                harfNotu = "DC";
            } else if (notOrtalamasi >= 30) {
                harfNotu = "DD";
            } else {
                harfNotu = "FF";
            }

            // Öğrenci bilgilerini saklama
            ogrenciBilgileri[i] = ogrenciler[i] + " - Harf Notu: " + harfNotu;

            // Öğrenci bilgilerini ekrana yazdırma
            System.out.println("Öğrenci: " + ogrenciler[i]);
            System.out.println("Vize Notu: " + vizeNotu);
            System.out.println("Final Notu: " + finalNotu);
            System.out.println("Not Ortalaması: " + notOrtalamasi);
            System.out.println("Harf Notu: " + harfNotu);
            System.out.println(); // Satır boşluğu
        }

        // Tüm öğrencilerin harf notlarını ekrana yazdırma
        System.out.println("Öğrenci Bilgileri:");
        for (String bilgi : ogrenciBilgileri) {
            System.out.println(bilgi);
        }
    }
}
