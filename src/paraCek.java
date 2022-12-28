import java.util.Scanner;

public class paraCek extends userInfo{
    public static void paraCek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(System.lineSeparator().repeat(50));
        System.out.println("\tBakiyeniz : " + bakiye + "$");
        System.out.print("\n\n\n\tCEKMEK ISTEDIGINIZ TUTARI GIRIN : ");
        int tutar1 = scanner.nextInt();

        if (tutar1 > 0 && tutar1 <= bakiye) {
            bakiye -= tutar1;
            System.out.println(System.lineSeparator().repeat(50));
            System.out.println("\n\tISLEMINIZ GERCEKLESTIRILIYOR...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(System.lineSeparator().repeat(50));
            System.out.println("\n\n\t- ISLEM BASARILI -\n\n");
            System.out.println("****************************************\n\n");
            System.out.println("\tCEKILEN TUTAR : " + tutar1 + " $");
            System.out.println("\n\n\tGUNCEL BAKIYENIZ : " + bakiye + " $");
            System.out.println("\n\n****************************************\n\n");
            System.out.print("\nGERI DONMEK ICIN ' 1 ' TUSLAYIN\n\n-> ");
            int secim2a = scanner.nextInt();
            if (secim2a == 1) {
                menuGetir.menuGetir();
            }
        } else {
            System.out.println("\n\n\t- GECERSIZ TUTAR -");
            System.out.println("\n\n****************************************\n\n");
            System.out.print("\nGERI DONMEK ICIN ' 1 ' TUSLAYIN\n\n-> ");
            int secim2b = scanner.nextInt();
            if (secim2b == 1) {
                menuGetir.menuGetir();

            }
        }
    }
}
