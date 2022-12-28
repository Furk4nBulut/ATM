import java.util.Scanner;

public class menu {
    public static void menu() {
        Scanner input = new Scanner(System.in);


        girisEkrani.girisEkrani();
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                girisYap.girisYap();
                break;
            case 2:
                hesapOlustur.hesapOlustur();
                break;
            case 3:
                cikis.cikis();
                break;
        }
    }
    }

