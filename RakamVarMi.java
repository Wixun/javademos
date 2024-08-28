public class Main {

    // 2 boyutlu string dizisi içindeki her bir string içindeki rakam var mı yok mu ekrana yazdıran metod
    public static void rakamVarMi(String[][] matris) {
        // 2 boyutlu diziyi döngüye alıyoruz
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                String eleman = matris[i][j];
                boolean rakamVarMi = false; // Her bir string için bu değişkeni başlatıyoruz

                // Her bir string içindeki rakamları kontrol ediyoruz
                for (int k = 0; k < eleman.length(); k++) {
                    char x = eleman.charAt(k);
                    if (x >= '0' && x <= '9') {
                        rakamVarMi = true;
                        break; // Rakam bulundu, bu string için kontrolü sonlandır
                    }
                }

                // Eğer rakam bulunmadıysa, stringi ekrana yazdırıyoruz
                if (!rakamVarMi) {
                    System.out.println(eleman);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Örnek bir 2 boyutlu string dizisi
        String[][] matris = {
                {"Hello123", "World456"},
                {"Java789", "Test"}
        };

        // Metodu çağırıp sonucu ekrana yazdırıyoruz
        rakamVarMi(matris);
    }
}
