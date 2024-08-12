public class Main {
    public static void main(String[] args) {
        String[] takimlar = {"GS", "FB", "BJK", "TS"};
        int[] puanlar = {3, 11, 7, 9};


        for (int i = 0; i < puanlar.length; i++) {
            int ebi = i;  //indis
            for (int j = i + 1; j < puanlar.length; j++) {
                if (puanlar[j] > puanlar[ebi]) {
                    ebi = j;
                }
            }
            int gecici = puanlar[i];
            puanlar[i] = puanlar[ebi];
            puanlar[ebi] = gecici;

            String geciciTakim = takimlar[i];
            takimlar[i] = takimlar[ebi];
            takimlar[ebi] = geciciTakim;

        }
        for (int i = 0; i < puanlar.length; i++) {
            System.out.println(takimlar[i] + " - " + puanlar[i]);
        }
    }
}
