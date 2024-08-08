import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gun;
        String burc = "";
        boolean hataVarMi = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz ay: ");
        ay = input.nextInt();

        System.out.print("Dogdugunuz gün: ");
        gun = input.nextInt();

        switch (ay) {
            case 1:
                if (gun >= 1 && gun <= 31) {
                    burc = (gun < 22) ? "Oglak" : "Kova";
                } else {
                    hataVarMi = true;
                }
                break;

            case 2:
                if (gun >= 1 && gun <= 28) {
                    burc = (gun < 20) ? "Kova" : "Balik";
                } else {
                    hataVarMi = true;
                }
                break;

            case 3:
                if (gun >= 1 && gun <= 31) {
                    burc = (gun < 21) ? "Balik" : "Koc";
                } else {
                    hataVarMi = true;
                }
                break;

            case 4:
                if (gun >= 1 && gun <= 30) {
                    burc = (gun < 21) ? "Koc" : "Boga";
                } else {
                    hataVarMi = true;
                }
                break;

            case 5:
                if (gun >= 1 && gun <= 31) {
                    burc = (gun < 22) ? "Boga" : "Ikizler";
                } else {
                    hataVarMi = true;
                }
                break;

            case 6:
                if (gun >= 1 && gun <= 30) {
                    burc = (gun < 23) ? "Ikizler" : "Yengec";
                } else {
                    hataVarMi = true;
                }
                break;

            case 7:
                if (gun >= 1 && gun <= 31) {
                    burc = (gun < 23) ? "Yengec" : "Aslan";
                } else {
                    hataVarMi = true;
                }
                break;

            case 8:
                if (gun >= 1 && gun <= 31) {
                    burc = (gun < 23) ? "Aslan" : "Basak";
                } else {
                    hataVarMi = true;
                }
                break;

            case 9:
                if (gun >= 1 && gun <= 30) {
                    burc = (gun < 23) ? "Basak" : "Terazi";
                } else {
                    hataVarMi = true;
                }
                break;

            case 10:
                if (gun >= 1 && gun <= 31) {
                    burc = (gun < 23) ? "Terazi" : "Akrep";
                } else {
                    hataVarMi = true;
                }
                break;

            case 11:
                if (gun >= 1 && gun <= 30) {
                    burc = (gun < 22) ? "Akrep" : "Yay";
                } else {
                    hataVarMi = true;
                }
                break;

            case 12:
                if (gun >= 1 && gun <= 31) {
                    burc = (gun < 22) ? "Yay" : "Oglak";
                } else {
                    hataVarMi = true;
                }
                break;

            default:
                System.out.println("Hatali bir ay girdiniz.");
                break;
        }

        if (hataVarMi) {
            System.out.println("Hatali giriş yaptınız. Tekrar deneyin.");
        } else {
            System.out.println("Burcunuz: " + burc);
        }
        input.close();
    }
}
