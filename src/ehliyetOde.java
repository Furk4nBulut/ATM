import java.util.Scanner;

public class ehliyetOde extends userInfo {
    public static  void ehliyetOde( ) {

        Scanner input = new Scanner(System.in);

        int ehliyet = 1200;
        int ehliyetToMenu, secim7;
        int secimEhliyet;
        System.out.println("**********************************************************");
        System.out.println("\n\n\tADINIZA KAYITLI EHLIYET HARC TUTARI : " + ehliyet + " $\n\n");
        System.out.println("**********************************************************\n\n");
        System.out.println("\tBakiyeniz : " + bakiye + " $\n\n");
        System.out.println("**********************************************************\n\n");
        System.out.println("\nODEME YAPMAK :\n\n\n\n\n\n");
        System.out.print(" 0 ) ISTEMIYORUM  \t\t\t  ISTIYORUM ( 1\n\n Seciminiz -> ");
        secimEhliyet = input.nextInt();

        if (secimEhliyet != 1) {
            menuGetir.menuGetir();
        }

        if (bakiye >= ehliyet) {
            System.out.println("\n\tISLEMINIZ GERCEKLESTIRILIYOR...");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bakiye -= ehliyet;
            System.out.println("\033[H\033[2J"); // Clear the console
            System.out.println("\n\n\t- ODEME ISLEMINIZ BASARIYLA TAMAMLANDI -\n\n");
            System.out.println("**********************************************************\n\n\n");
            System.out.println(" GUNCEL BAKIYENIZ : " + bakiye + " $\n\n");
            System.out.println("**********************************************************\n\n\n");
            System.out.print("MENUYE DONMEK ICIN ' 0 ' TUSLAYIN\n\n Seciminiz -> ");
            ehliyetToMenu = input.nextInt();

            if (ehliyetToMenu == 0) {
                menuGetir.menuGetir();
            }
        }

        if (bakiye < ehliyet) {
            System.out.println("\n\n\t- YETERSIZ TUTAR -");
            System.out.println("\n\n****************************************\n\n");
            System.out.print("\nGERI DONMEK ICIN ' 0 ' TUSLAYIN\n\n -> ");
            secim7 = input.nextInt();
            if (secim7 == 0) {
                menuGetir.menuGetir();
            }
        }
    }
}