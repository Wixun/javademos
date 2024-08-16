import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Verilen stringte kaç tane büyük harf kaç tane küçük harf vardır?
        Scanner input = new Scanner(System.in);
        String kelime = input.next();
        int buyukHarfSayisi = 0;
        int kucukHarfSayisi = 0;

        for (int i = 0; i < kelime.length(); i++) {
            char ch = kelime.charAt(i);
            if (ch >= 65 &&  ch <= 90) {
                buyukHarfSayisi++;
            }

            if (ch >= 97 && ch <= 122) {

                kucukHarfSayisi++;
            }
        }
        System.out.println("Büyük harf sayısı: " + buyukHarfSayisi);
        System.out.println("Küçük harf sayısı: " + kucukHarfSayisi);
    }
}
