import java.util.Scanner;

public class menuGetir extends userInfo {
    public static void menuGetir()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------\n\t");
        System.out.println("\t   * ZAMAR BANK'A HOSGELDINIZ *\t\n");
        System.out.println("----------------------------------------------------------\n");
        System.out.println("\t\t - LUTFEN ISLEM SECINIZ -\n");
        System.out.println("**********************************************************\n");
        System.out.println("   1 ) Bakiye Goruntule\t\t\tFatura Ode ( 6\n");
        System.out.println("   2 ) Para Cek\t\t\t Ehliyet Harci Ode ( 7\n");
        System.out.println("   3 ) Para Yatir\t\t    OSYM Odemeleri ( 8\n");
        System.out.println("   4 ) Havale / EFT\t\t Trafik Cezasi Ode ( 9\n");
        System.out.println("   5 ) IBAN Sorgula\t\t   Vergi Odemeleri ( 10\n\n");
        System.out.println("\t\t    11 ) Sifre Degistir\n\n");
        System.out.println("\t\t    12 ) Cikis Yap\n\n");
        System.out.println("**********************************************************\n Seciminiz -> "); int secim = sc.nextInt();
        switch (secim) {
            case 1:
                System.out.println("\n\n\tBAKIYE : " + bakiye + "$");
                System.out.println("\n\n************************************************");
                System.out.print("\n\n\tGERI DONMEK ICIN '1' TUSLAYINIZ\n\n-> ");
                int secim1 = sc.nextInt();
                if (secim1 == 1) {
                    menuGetir.menuGetir();

                }
                break;
            case 2:
                paraCek.paraCek();
                break;
            case 3:
                paraYatir.paraYatir();
                break;
            case 4:
                havaleEft.havaleEft();
                break;
            case 5:
                ibanSorgula.ibanSorgula();
                break;
            case 6:
                faturaOde.faturaOde();
                break;
            case 7:
                ehliyetOde.ehliyetOde();
                break;
            case 8:
                osymOde.osymOde();
                break;
            case 9:
                trafikOde.trafikOde();
                break;
            case 10:
                vergiOde.vergiOde();
                break;
            case 11:
                sifreDegistir.sifreDegistir();
                break;
            case 12:
                System.out.println("\n\n\tCIKIS YAPILIYOR...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // Handle exception
                }
        }
    }
}