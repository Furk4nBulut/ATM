import java.util.Scanner;

public class trafikOde extends userInfo{
    public static void trafikOde() {
        Scanner in = new Scanner(System.in);

        int trafik = 180;
        int secimTrafik;
        System.out.println("**********************************************************");
        System.out.println("\n\n\tADINIZA KAYITLI CEZA TUTARI : " + trafik + " $\n\n");
        System.out.println("**********************************************************\n\n");
        System.out.println("\tBakiyeniz : " + bakiye + " $\n\n");
        System.out.println("**********************************************************\n\n");
        System.out.println("\nODEME YAPMAK :\n\n\n\n\n\n");
        System.out.print(" 0 ) ISTEMIYORUM \t\t\t  ISTIYORUM ( 1\n\n Seciminiz -> ");
        secimTrafik = in.nextInt();

        if (secimTrafik != 1) {
            menuGetir.menuGetir();
        }

        if (bakiye >= trafik) {
            System.out.println("\n\tISLEMINIZ GERCEKLESTIRILIYOR...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Do nothing
            }
            bakiye -= trafik;
            System.out.println("\n\n\t- ODEME ISLEMINIZ BASARIYLA TAMAMLANDI -\n\n");
            System.out.println("**********************************************************\n\n\n");
            System.out.println(" GUNCEL BAKIYENIZ : " + bakiye + " $\n\n");
            System.out.println("**********************************************************\n\n\n");
            System.out.print("MENUYE DONMEK ICIN ' 0 ' TUSLAYIN\n\n Seciminiz -> ");
            int trafikToMenu = in.nextInt();

            if (trafikToMenu == 0) {
                menuGetir.menuGetir();
            }
        }

        if (bakiye < trafik) {
            System.out.println("\n\n\t- YETERSIZ TUTAR -");
            System.out.println("\n\n****************************************\n\n");
            System.out.print("\nGERI DONMEK ICIN ' 0 ' TUSLAYIN\n\n -> ");
            int secim9 = in.nextInt();
            if (secim9 == 0) {
                menuGetir.menuGetir();
            }
        }
    }
}
