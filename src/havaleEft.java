import java.util.Scanner;

public class havaleEft {
    public static void havaleEft() {
        int sifre = 0, yeniSifre, musteriNo=0, bakiye=1000;

        Scanner sc = new Scanner(System.in);
        System.out.println("\tBakiyeniz : " + bakiye + " $\n\n\n");
        System.out.print(" HAVALE/EFT YAPMAK ISTEDIGINIZ IBAN : TR");
        long iban = sc.nextLong();
        System.out.print("\n\n AD : ");
        String ad = sc.nextLine();
        System.out.print("\n SOYAD : ");
        String soyad = sc.nextLine();
        System.out.print("\n\n\n HAVALE/EFT TUTARI GIRIN : ");
        int tutar4 = sc.nextInt();
        if (tutar4 > 0 && tutar4 <= bakiye) {
            bakiye -= tutar4;
            System.out.println("\n\tISLEMINIZ GERCEKLESTIRILIYOR...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle exception
            }
            System.out.println("\n\n\t- ISLEM BASARILI -\n\n");
            System.out.println("****************************************\n\n");
            System.out.println("\t' " + ad + " " + soyad + " '  ADINA  : \n\n\n");
            System.out.println("\tHAVALE/EFT YAPILAN TUTAR : " + tutar4 + " $");
            System.out.println("\n\n\tGUNCEL BAKIYENIZ : " + bakiye + " $");
            System.out.println("\n\n****************************************\n\n");
            System.out.print("\nGERI DONMEK ICIN ' 1 ' TUSLAYIN\n\n-> ");
            int secim4a = sc.nextInt();
            if (secim4a == 1) {
                menuGetir.menuGetir();
            }
        } else {
            System.out.println("\n\n\t- GECERSIZ TUTAR -");
            System.out.println("\n\n****************************************\n\n");
            System.out.print("\nGERI DONMEK ICIN ' 1 ' TUSLAYIN\n\n-> ");
            int secim4b = sc.nextInt();
            if (secim4b == 1) {
                menuGetir.menuGetir();
            }
        }
    }
}
