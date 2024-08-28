public class Main {

    // string içindeki sayilari kaldirip stringleri yazdir

    public static void rakamSil(String[][] matris) {
        // 2 boyutlu diziyi döngüye alıyoruz
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                String eleman = matris[i][j];


                // Her bir string içindeki rakamları kontrol ediyoruz
                for (int k = 0; k < eleman.length(); k++) {
                    char x = eleman.charAt(k);
                    if (!(x >= '0' && x <= '9')) {
                        System.out.print(x);
                    }
                }
                System.out.println("");
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
        rakamSil(matris);
    }
}
