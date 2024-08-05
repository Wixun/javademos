import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ürünlerin kilogram fiyatları
        final double ARMUT_FIYAT = 2.14;
        final double ELMA_FIYAT = 3.67;
        final double DOMATES_FIYAT = 1.11;
        final double MUZ_FIYAT = 0.95;
        final double PATLICAN_FIYAT = 5.00;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan kilogram bilgilerini al
        System.out.print("Armut Kaç Kilo ? : ");
        double armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKilo = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlicanKilo = input.nextDouble();

        // Toplam tutarı hesapla
        double toplamTutar = (armutKilo * ARMUT_FIYAT) +
                (elmaKilo * ELMA_FIYAT) +
                (domatesKilo * DOMATES_FIYAT) +
                (muzKilo * MUZ_FIYAT) +
                (patlicanKilo * PATLICAN_FIYAT);

        // Toplam tutarı ekrana yazdır
        System.out.printf("Toplam Tutar : %.2f TL%n", toplamTutar);
    }
}
