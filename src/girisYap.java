import java.util.Scanner;


public class girisYap  extends userInfo{
//for debug

    public static void girisYap() {
        int girilenNo;
        int girilenSifre;
        Scanner scanner = new Scanner(System.in);
        System.out.println(System.lineSeparator().repeat(50));
        System.out.println("\t\t- Hosgeldiniz -\n\n");
        System.out.print("Musteri Numarasi : ");
        girilenNo = scanner.nextInt();
        System.out.print("\nSifre : ");
        girilenSifre = scanner.nextInt();

        if (girilenSifre == sifre && girilenNo == musteriNo) {
            System.out.println("\n\t\tGIRIS BASARILI! Yonlendiriliyorsunuz...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(System.lineSeparator().repeat(50));
            System.out.println("\n\t\tGIRIS BASARILI! Yonlendiriliyorsunuz...");
            menuGetir.menuGetir();
        } else {
            System.out.println("\nGIRIS BASARISIZ! Lutfen Tekrar Deneyiniz.\n\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" \n\tANA MENUYE YONLENDIRILIYORSUNUZ : 3");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" \n\tANA MENUYE YONLENDIRILIYORSUNUZ : 2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" \n\tANA MENUYE YONLENDIRILIYORSUNUZ : 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            menu.menu();
        }
    }
}
