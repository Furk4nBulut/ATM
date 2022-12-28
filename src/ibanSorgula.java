import java.util.Scanner;

public class ibanSorgula {
    public static void ibanSorgula() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tHESABINIZA KAYITLI IBAN BILGILERI ASAGIDA YER ALMAKTADIR :\n\n");
        System.out.println("*******************************************************************************\n\n\n");
        System.out.println("\tIBAN : TR02 0006 7010 0000 0079 8486 19");
        System.out.println("\n\n\n*******************************************************************************\n\n");
        System.out.println("\t- IBAN BILGILERINIZ CEP TELEFONUNUZA SMS OLARAK GONDERILMISTIR -");
        System.out.println("\n\n*******************************************************************************\n");
        System.out.print("\n\nGERI DONMEK ICIN ' 1 ' TUSLAYIN\n\n-> ");
        int secim5 = sc.nextInt();
        if (secim5 == 1) {
            menuGetir.menuGetir();
        }
    }
}
