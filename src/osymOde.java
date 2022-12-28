import java.util.Scanner;

public class osymOde extends userInfo{
    public static void osymOde() {
        Scanner in = new Scanner(System.in);
        int osym = 180;
        int secimOsym;
        System.out.println("**********************************************************");
        System.out.println("\n\n\tADINIZA KAYITLI YKS HARC TUTARI : " + osym + " $\n\n");
        System.out.println("**********************************************************\n\n");
        System.out.println("\tBakiyeniz : " + bakiye + " $\n\n");
        System.out.println("**********************************************************\n\n");
        System.out.println("\nODEME YAPMAK :\n\n\n\n\n\n");
        System.out.print(" 0 ) ISTEMIYORUM  \t\t\t   ISTIYORUM ( 1\n\n Seciminiz -> ");
        secimOsym = in.nextInt();

        if (secimOsym != 1) {
            new menuGetir();
        }

        if (bakiye >= osym) {
            System.out.println("\n\tISLEMINIZ GERCEKLESTIRILIYOR...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Do nothing
            }
            bakiye -= osym;
            System.out.println("\n\n\t- ODEME ISLEMINIZ BASARIYLA TAMAMLANDI -\n\n");
            System.out.println("**********************************************************\n\n\n");
            System.out.println(" GUNCEL BAKIYENIZ : " + bakiye + " $\n\n");
            System.out.println("**********************************************************\n\n\n");
            System.out.print("MENUYE DONMEK ICIN ' 0 ' TUSLAYIN\n\n Seciminiz -> ");
            int osymToMenu = in.nextInt();

            if (osymToMenu == 0) {
              menuGetir.menuGetir();
            }
        }

        if (bakiye < osym) {
            System.out.println("\n\n\t- YETERSIZ TUTAR -");
            System.out.println("\n\n****************************************\n\n");
            System.out.print("\nGERI DONMEK ICIN ' 0 ' TUSLAYIN\n\n -> ");
            int secim8 = in.nextInt();
            if (secim8 == 0) {
                menuGetir.menuGetir();

            }
        }
    }
}
