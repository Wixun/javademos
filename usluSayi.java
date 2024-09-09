import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban, us;
        int sonuc = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Taban ve üs sayısını giriniz: ");
        taban = input.nextInt();
        us = input.nextInt();

        // Eğer üs negatif ise bunu da kontrol edelim
        if (us < 0) {
            System.out.println("Üs negatif olamaz!");
        } else {
            for (int i = 1; i <= us; i++) {
                sonuc *= taban;
            }
            System.out.println("Sonuç: " + sonuc);
        }
    }
}
