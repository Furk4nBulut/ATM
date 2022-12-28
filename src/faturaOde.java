import java.util.Scanner;

public class faturaOde extends userInfo {
    public  static void faturaOde()  {
        int elektrik=42, su=35, dogalgaz=13, internet=60;
        System.out.println("\t\t - LUTFEN ISLEM SECINIZ -");
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println(" 1 ) ELEKTRIK");
        System.out.println();
        System.out.println(" 2 ) SU");
        System.out.println();
        System.out.println(" 3 ) DOGALGAZ");
        System.out.println();
        System.out.println(" 4 ) INTERNET");
        System.out.println();
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("GERI DONMEK ICIN ' 0 ' TUSLAYIN");
        System.out.println();
        System.out.print(" Seciminiz -> ");
        Scanner scanner =  new Scanner(System.in);

        int faturaSecimi = scanner.nextInt();

        if (faturaSecimi == 0) {
            menuGetir.menuGetir();
        }
        if (faturaSecimi == 1) {
            System.out.println("\n\n\tADINIZA KAYITLI ELEKTRIK FATURA TUTARI : " + elektrik + " $\n\n");
            System.out.println("\tBakiyeniz : " + bakiye + " $\n\n");
            System.out.println("\nODEME YAPMAK :\n\n\n\n\n\n");
            System.out.println(" 0 ) ISTEMIYORUM  \t\t\t  ISTIYORUM ( 1\n\n Seciminiz -> ");
            int secimElektrik = scanner.nextInt();

            if (secimElektrik != 1) {
                menuGetir.menuGetir();
            }

            if (bakiye >= elektrik) {
                System.out.println("\n\tISLEMINIZ GERCEKLESTIRILIYOR...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


                bakiye -= elektrik;
                System.out.println("\n\n\t- ODEME ISLEMINIZ BASARIYLA TAMAMLANDI -\n\n");
                System.out.println("**********************************************************\n\n\n");
                System.out.println(" GUNCEL BAKIYENIZ : " + bakiye + " $\n\n");
                System.out.println("**********************************************************\n\n\n");
                System.out.println("MENUYE DONMEK ICIN ' 0 ' TUSLAYIN\n\n Seciminiz -> ");
                int elektrikToMenu = scanner.nextInt();

                if (elektrikToMenu == 0) {
                    menuGetir.menuGetir();
                }
            }

            if (bakiye < elektrik) {
                System.out.println("\n\n\t- YETERSIZ TUTAR -");
                System.out.println("\n\n****************************************\n\n");
                System.out.println("\nGERI DONMEK ICIN ' 0 ' TUSLAYIN\n\n -> ");
                int secim6a = scanner.nextInt();
                if (secim6a == 0) {
                    menuGetir.menuGetir();
                }
            }
        }

        if (faturaSecimi == 3) {
            System.out.println("\n\n\tADINIZA KAYITLI DOGALGAZ FATURA TUTARI : " + dogalgaz + " $\n\n");
            System.out.println("\tBakiyeniz : " + bakiye + " $\n\n");
            System.out.println("\nODEME YAPMAK :\n\n\n\n\n\n");
            System.out.println(" 0 ) ISTEMIYORUM  \t\t\t  ISTIYORUM ( 1\n\n Seciminiz -> ");
            int secimDogalgaz = scanner.nextInt();

            if (secimDogalgaz != 1) {
                menuGetir.menuGetir();
            }

            if (bakiye >= dogalgaz) {
                System.out.println("\n\tISLEMINIZ GERCEKLESTIRILIYOR...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                bakiye -= dogalgaz;
                System.out.println("\n\n\t- ODEME ISLEMINIZ BASARIYLA TAMAMLANDI -\n\n");
                System.out.println("**********************************************************\n\n\n");
                System.out.println(" GUNCEL BAKIYENIZ : " + bakiye + " $\n\n");
                System.out.println("**********************************************************\n\n\n");
                System.out.println("MENUYE DONMEK ICIN ' 0 ' TUSLAYIN\n\n Seciminiz -> ");
                int dogalgazToMenu = scanner.nextInt();

                if (dogalgazToMenu == 0) {
                    menuGetir.menuGetir();
                }
            }

            if (bakiye < dogalgaz) {
                System.out.println("\n\n\t- YETERSIZ TUTAR -");
                System.out.println("\n\n****************************************\n\n");
                System.out.println("\nGERI DONMEK ICIN ' 0 ' TUSLAYIN\n\n -> ");
                int secim6c = scanner.nextInt();
                if (secim6c == 0) {
                    menuGetir.menuGetir();
                }
            }
        }

        if (faturaSecimi == 4) {
            System.out.println("\n\n\tADINIZA KAYITLI SU FATURA TUTARI : " + internet + " $\n\n");
            System.out.println("\tBakiyeniz : " + bakiye + " $\n\n");
            System.out.println("\nODEME YAPMAK :\n\n\n\n\n\n");
            System.out.println(" 0 ) ISTEMIYORUM  \t\t\t  ISTIYORUM ( 1\n\n Seciminiz -> ");
            int secimInternet = scanner.nextInt();

            if (secimInternet != 1) {
                menuGetir.menuGetir();
            }

            if (bakiye >= internet) {
                System.out.println("\n\tISLEMINIZ GERCEKLESTIRILIYOR...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                bakiye -= internet;
                System.out.println("\n\n\t- ODEME ISLEMINIZ BASARIYLA TAMAMLANDI -\n\n");
                System.out.println("**********************************************************\n\n\n");
                System.out.println(" GUNCEL BAKIYENIZ : " + bakiye + " $\n\n");
                System.out.println("**********************************************************\n\n\n");
                System.out.println("MENUYE DONMEK ICIN ' 0 ' TUSLAYIN\n\n Seciminiz -> ");
                int internetToMenu = scanner.nextInt();

                if (internetToMenu == 0) {
                    menuGetir.menuGetir();
                }
            }

            if (bakiye < internet) {
                System.out.println("\n\n\t- YETERSIZ TUTAR -");
                System.out.println("\n\n****************************************\n\n");
                System.out.println("\nGERI DONMEK ICIN ' 0 ' TUSLAYIN\n\n -> ");
                int secim6d = scanner.nextInt();
                if (secim6d == 0) {
                    menuGetir.menuGetir();
                }
            }
        }


    }}
