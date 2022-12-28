import java.util.Scanner;

public class vergiOde extends userInfo {
    public static void vergiOde() {
        Scanner sc = new Scanner(System.in);
        int vergi = 384;
        System.out.println("**********************************************************");
        System.out.println("\n\n\tADINIZA KAYITLI VERGI BORCU : " + vergi + " $\n\n");
        System.out.println("**********************************************************\n\n");
        System.out.println("\tBakiyeniz : " + bakiye + " $\n\n");
        System.out.println("**********************************************************\n\n");
        System.out.println("\nODEME YAPMAK :\n\n\n\n\n\n");
        System.out.println(" 0 ) ISTEMIYORUM  \t\t\t  ISTIYORUM ( 1\n\n Seciminiz -> ");
        int secimVergi = sc.nextInt();

        if (secimVergi != 1) {
            menuGetir.menuGetir();
        }

        if (bakiye >= vergi) {
            System.out.println("\n\tISLEMINIZ GERCEKLESTIRILIYOR...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle exception
            }
            bakiye -= vergi;
            System.out.println("\n\n\t- ODEME ISLEMINIZ BASARIYLA TAMAMLANDI -\n\n");
            System.out.println("**********************************************************\n\n\n");
            System.out.println(" GUNCEL BAKIYENIZ : " + bakiye + " $\n\n");
            System.out.println("**********************************************************\n\n\n");
            System.out.println("MENUYE DONMEK ICIN ' 0 ' TUSLAYIN\n\n Seciminiz -> ");
            int vergiToMenu = sc.nextInt();

            if (vergiToMenu == 0) {
                menuGetir.menuGetir();
            }
        }

        if (bakiye < vergi) {
            System.out.println("\n\n\t- YETERSIZ TUTAR -");
            System.out.println("\n\n****************************************\n\n");
            System.out.println("\nGERI DONMEK ICIN ' 0 ' TUSLAYIN\n\n -> ");
            int secim10 = sc.nextInt();
            if (secim10 == 0) {
                menuGetir.menuGetir();
            }
        }
    }
}
