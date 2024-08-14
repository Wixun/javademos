import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int[] dizi = {1, 2, 10, 15, 25, 30, 41};

        for (int eleman : dizi)
            System.out.print(eleman + " ");

        int aranan, indis = -1, bas = 0, orta, son = dizi.length - 1;

        System.out.println("Aranacak elemani gir: ");
        aranan = klavye.nextInt();

        while (son >= bas) {
            orta = (son + bas) / 2;

            if (aranan < dizi[orta])
                son = orta - 1;
            else if (aranan > dizi[orta])
                bas = orta + 1;
            else if (aranan == dizi[orta]) {
                indis = orta;
                break;
            }
        }
        if (indis != -1)
            System.out.println(aranan + " dizide " + indis + " pozisyonda bulundu");
        else
            System.out.println("aranan bulunamadi.");
    }
}
