import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Faktoriyeli alinacak sayiyi giriniz: ");
        int sayi = input.nextInt();
        System.out.println("Faktoriyeli alinacak ikinci sayiyi giriniz: ");
        int sayi2 = input.nextInt();

        if (sayi2 > sayi) {
            System.out.println("İkinci sayı, birinci sayıdan büyük olamaz.");
        } else {
            int fact = 1;
            int fact2 = 1;
            int fact3 = 1;

            for (int i = 1; i <= sayi; i++) {
                fact *= i;
            }

            for (int j = 1; j <= sayi2; j++) {
                fact2 *= j;
            }

            for (int d = 1; d <= sayi - sayi2; d++) {
                fact3 *= d;
            }

            int comb = fact / (fact2 * fact3);

            System.out.println("Kombinasyon sonucu: " + comb);
        }

        input.close();
    }
}
