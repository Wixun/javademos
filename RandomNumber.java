import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        Random random = new Random();

        // Rastgele bir sayi üretmek için aralik belirleyin (örneğin, 1-100)
        int min = 1;
        int max = 100;
        int numberToGuess = random.nextInt(max - min + 1) + min;

        // Kullaniciya kaç tahmin hakki verileceğini belirleyin
        int maxAttempts = 10;
        int attempts = 0;

        System.out.println("Bir sayiyi tahmin et! (" + min + "ile" + max + "arasinda)");
        boolean hasGuessedCorrectly = false;

        while (attempts < maxAttempts && !hasGuessedCorrectly) {
            System.out.println("Tahmininiz: ");
            int userGuess = al.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Yukari");
            } else if (userGuess > numberToGuess) {
                System.out.println("Aşagi");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Tebrikler! Doğru tahmin ettiniz");
            }
        }
        if (!hasGuessedCorrectly) {
            System.out.println("Uzgunum, hakkiniz doldu. Dogru sayi: " + numberToGuess);
        }
        al.close();
    }
}
