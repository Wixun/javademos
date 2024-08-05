import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double baslangicTutar = 10;
        double tutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Kac km mesafe gidildi ?");
        int mesafe = input.nextInt();

        tutar = (mesafe * 2.20) + baslangicTutar;

        if (tutar < 20) {
            tutar = 20;
        }
        System.out.println("Taksimetre Ucretiniz: " + tutar);
    }
}
