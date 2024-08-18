import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] takimlar = {"GS", "FB", "BJK", "TS"};
        int[] puanlar = new int[takimlar.length];
        Random random = new Random();

        for (int i = 0; i < takimlar.length; i++) {
            for (int j = i + 1; j < takimlar.length; j++) {
                int result = random.nextInt(3); // 0: i wins, 1: j wins, 2: draw
                if (result == 0) {
                    puanlar[i] += 3;
                    System.out.println(takimlar[i] + " " + takimlar[j] + " karşılaşması: " + takimlar[i] + " kazandı.");
                } else if (result == 1) {
                    puanlar[j] += 3;
                    System.out.println(takimlar[i] + " " + takimlar[j] + " karşılaşması: " + takimlar[j] + " kazandı.");
                } else {
                    puanlar[i] += 1;
                    puanlar[j] += 1;
                    System.out.println(takimlar[i] + " " + takimlar[j] + " karşılaşması: Berabere.");
                }
            }
        }

        // Sıralama
        for (int i = 0; i < puanlar.length - 1; i++) {
            for (int j = i + 1; j < puanlar.length; j++) {
                if (puanlar[j] > puanlar[i]) {
                    int tempPuan = puanlar[i];
                    puanlar[i] = puanlar[j];
                    puanlar[j] = tempPuan;

                    String tempTakim = takimlar[i];
                    takimlar[i] = takimlar[j];
                    takimlar[j] = tempTakim;
                }
            }
        }

        System.out.println("\nTakımların sıralaması:");
        for (int i = 0; i < takimlar.length; i++) {
            System.out.println((i + 1) + ". " + takimlar[i] + " - " + puanlar[i] + " puan");
        }
    }
}
