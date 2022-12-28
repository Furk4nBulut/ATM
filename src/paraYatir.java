import java.util.Scanner;

public class paraYatir extends userInfo{
    public static void paraYatir() {
        System.out.println("\n\tBakiyeniz : " + bakiye + "$");
        System.out.println("\n\n\n\tYATIRMAK ISTEDIGINIZ TUTARI GIRIN : ");
        Scanner sc = new Scanner(System.in);
        int tutar3 = sc.nextInt();
        if (tutar3 > 0) {
            bakiye += tutar3;
            System.out.println("\n\tISLEMINIZ GERCEKLESTIRILIYOR...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n\n\t- ISLEM BASARILI -\n\n");
            System.out.println("****************************************\n\n");
            System.out.println("\tYATIRILAN TUTAR : " + tutar3 + " $");
            System.out.println("\n\n\tGUNCEL BAKIYENIZ : " + bakiye + " $");
            System.out.println("\n\n****************************************\n\n");
            System.out.println("\nGERI DONMEK ICIN ' 1 ' TUSLAYIN\n\n-> ");
            int secim3a = sc.nextInt();
            if (secim3a == 1) {
                menuGetir.menuGetir();

            }
        } else {
            System.out.println("\n\n\t- GECERSIZ TUTAR -");
            System.out.println("\n\n****************************************\n\n");
            System.out.println("\nGERI DONMEK ICIN ' 1 ' TUSLAYIN\n\n-> ");
            int secim3b = sc.nextInt();
            if (secim3b == 1) {
                menuGetir.menuGetir();

            }
        }
    }

}
