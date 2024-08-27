public class Main {
    public static void main(String[] args) {

        // 3 satır ve her satırda 5 sütun
        int dizi[][] = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10},
                {11, 13, 15, 17, 19}
        };
        int i, j;

        // 3 aranan değer
        int[] arananlar = {5, 8, 21};  // Her satır için bir aranan değer
        boolean bulunduMu;

        for (i = 0; i < dizi.length; i++) {
            bulunduMu = false;  // Her satır için sıfırla
            int aranan = arananlar[i];  // Her satır için o satıra ait aranan değeri al
            for (j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] == aranan) {
                    bulunduMu = true;
                }
            }

            if (bulunduMu) {
                System.out.println("Aranan " + aranan + " bulundu: [" + i + "][" + j + "]");
            } else {
                System.out.println("Aranan " + aranan + " bulunamadı.");
            }
        }
    }
}
