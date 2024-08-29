public class Main {
    public static void main(String[] args) {
        String dans[] = {"Eren&"};
        boolean sonuc = Odun(dans);
    }

    public static boolean Odun(String[] dans) {
        boolean varMi = false;
        String ozelkarakter = "!@#$%*&+";

        // Dans dizisindeki ilk öğeyi alıyoruz
        String kelime = dans[0];

        // Her bir kelime karakterini kontrol et
        for (int i = 0; i < kelime.length(); i++) {
            char ch2 = kelime.charAt(i);

            // Her özel karakter ile karşılaştır
            for (int j = 0; j < ozelkarakter.length(); j++) {
                if (ch2 == ozelkarakter.charAt(j)) {
                    varMi = true;
                    break;
                }
            }

            // Eğer karakter bulunduysa döngüyü kır
            if (varMi) {
                break;
            }
        }

        if (varMi) {
            System.out.println("Karakter var");
        } else {
            System.out.println("Karakter yok");
        }
        return varMi;
    }
}
