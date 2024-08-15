import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);

        int[] dizi = {1, 2, 10, 15, 25, 3, -1};

        for (int eleman : dizi)
            System.out.print(eleman + " ");

        int aranan, indis = -1;

        System.out.println("Aranacak elemani gir: ");
        aranan = klavye.nextInt();

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                indis = i;
                break;
            }
        }
        if (indis != -1)
            System.out.println(aranan + " dizide " + indis + " pozisyonda bulundu");

        else
            System.out.println("aranan bulunamadi.");
    }
}
