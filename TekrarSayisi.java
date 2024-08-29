import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];

        // Diziyi kullanıcıdan doldur
        fillArrayFromUser(numbers, scanner);

        // Kullanıcıdan aranacak sayıyı al
        System.out.print("Lütfen aramak istediğiniz tam sayıyı giriniz: ");
        int targetNumber = scanner.nextInt();

        // Dizideki sayının tekrarını bul
        int frequency = findFrequency(numbers, targetNumber);

        // Sonucu yazdır
        printResult(targetNumber, frequency);
    }

    // Diziyi kullanıcıdan dolduran fonksiyon
    public static void fillArrayFromUser(int[] array, Scanner scanner) {
        System.out.println("100 elemanlı bir tam sayı dizisi giriniz:");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". elemanı giriniz: ");
            array[i] = scanner.nextInt();
        }
    }

    // Sayının dizide kaç kez tekrar ettiğini bulan fonksiyon
    public static int findFrequency(int[] array, int targetNumber) {
        int count = 0; // Sayının kaç kez tekrar ettiğini saymak için değişken
        int index = 0; // Dizideki mevcut konum için değişken

        // Do-While döngüsü ile dizide arama yap
        do {
            if (array[index] == targetNumber) {
                count++; // Eğer sayı bulunursa sayacı arttır
            }
            index++; // Bir sonraki elemana geç
        } while (index < array.length);

        return count;
    }

    // Sonucu yazdıran fonksiyon
    public static void printResult(int targetNumber, int frequency) {
        System.out.println("Girilen sayı " + targetNumber + " dizide " + frequency + " kez tekrar etti.");
    }
}
