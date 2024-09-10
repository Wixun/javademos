import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Harmonik Sayi Giriniz: ");
        int harmonik = input.nextInt();
        double sonuc = 0.0;


        for (int i = 1; i <= harmonik; i++) {
            sonuc += 1.0 / i;
        }

        System.out.println(sonuc);
    }
}
