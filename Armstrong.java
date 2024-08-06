import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        scanner.close(); // Kaynak sızıntılarını önlemek için scanner'ı kapatıyoruz.

        int originalNumber = number; // Sayının orijinal değerini saklıyoruz
        int result = 0; // Basamakların kuvvetlerinin toplamını saklamak için değişken
        int n = 0; // Sayının basamak sayısını saklamak için değişken

        // Sayının basamak sayısını buluyoruz
        while (originalNumber != 0) {
            originalNumber /= 10;
            n++;
        }

        originalNumber = number; // Orijinal sayıyı tekrar başlatıyoruz

        // Sayının basamaklarını teker teker işleriz
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Son basamağı buluruz
            result += Math.pow(digit, n); // Basamağın n'inci kuvvetini toplama ekleriz
            originalNumber /= 10; // Son basamağı sayıdan çıkarırız
        }

        // Toplam, sayının kendisine eşitse Armstrong sayısıdır
        if (result == number) {
            System.out.println(number + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayısı değildir.");
        }
    }
}
