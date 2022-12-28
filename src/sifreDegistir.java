import java.util.Scanner;

public class sifreDegistir extends userInfo {
    public static void sifreDegistir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\tSIFRENIZI DEGISTIRMEK ICIN MEVCUT SIFRENIZI GIRIN : ");
        int denenenSifre = sc.nextInt();
        if (denenenSifre == sifre) {
            System.out.println("\n\tYENI SIFRENIZI GIRIN : ");
            int yeniSifre = sc.nextInt();
            if (yeniSifre == sifre) {
                System.out.println(
                        "\n\tGIRDIGINIZ SIFRE ESKI SIFRENIZ ILE AYNIDIR!\n\n\n\tYonlendiriliyorsunuz...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    // Handle exception
                }
                menuGetir.menuGetir();

            }
            sifre = yeniSifre;
            System.out.println(
                    "\n\t- SIFRENIZ BASARIYLA DEGISTIRILMISTIR -\n\n\n\tYonlendiriliyorsunuz...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // Handle exception
            }
            menuGetir.menuGetir();

        }
        if (denenenSifre != sifre) {
            System.out.println(
                    "\n\t- GIRDIGINIZ SIFRE YANLIS! -\n\n\n\tYonlendiriliyorsunuz...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // Handle exception
            }
            menuGetir.menuGetir();

        }
    }
}
