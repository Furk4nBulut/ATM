import java.util.Scanner;

public class hesapOlustur extends userInfo{
    public static void hesapOlustur() {
        int cikisTercihi;
        Scanner scanner = new Scanner(System.in);
        System.out.println(System.lineSeparator().repeat(50));
        System.out.println("\t\t- HOSGELDINIZ! -\n\n Musteri Numarasi ve Sifrenizi Belirleyerek Hesap Olusturabilirsiniz:\n\n");
        System.out.print("Musteri No Belirleyin : ");
        musteriNo = scanner.nextInt();
        System.out.print("\nSifrenizi Belirleyin : ");
        sifre = scanner.nextInt();
        System.out.println(System.lineSeparator().repeat(50));
        System.out.println("\n\t   Tesekkurler! Hesabiniz Olusturuldu.\n\n\tKullanici Bilgileriniz Asagida Yer Almaktadir :\n");
        System.out.println("****************************************************************\n");
        System.out.println(" Musteri Numaraniz : " + musteriNo + "\n");
        System.out.println(" Sifreniz : " + sifre + "\n");
        System.out.println("****************************************************************\n");
        System.out.println("* Bu bilgiler size ozeldir. Lutfen Baskalariyla Paylasmayin!\n\t");
        System.out.println("\tIYI GUNLER!\n");
        System.out.println("****************************************************************\n");
        System.out.println("\t-> GIRIS EKRANINA DONMEK ICIN ' 1 ' TUSLAYIN\n");
        System.out.println("\t-> x CIKIS YAPMAK ICIN HERHANGI BIR TUSA BASIN x\n\n\tSeciminiz -> "); cikisTercihi = scanner.nextInt();
        System.out.println(System.lineSeparator().repeat(50));

        if (cikisTercihi == 1) {
            System.out.println(System.lineSeparator().repeat(50));
            System.out.println("\n\t\tGiris Ekranina Donuyorsunuz...");
            System.out.println(System.lineSeparator().repeat(50));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            menu.menu();
        }
    }
}
