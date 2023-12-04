import java.util.Scanner;

/*
 * Student Registration Automation [ Basic - Java C++/C# - Practice assignment]
 * ozgurseng
 * https://github.com/ozgurseng
 *
 * MainClass.java
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BagliListe bagliListe = new BagliListe();

        int secim;
        do {
            System.out.println("");
            System.out.println("***********************************************");
            System.out.println("*** Öğrenci Kayıt Otomasyonuna Hoş Geldiniz ***");
            System.out.println("***********************************************");
            System.out.println("");
            System.out.println("1. Yeni Öğrenci Ekle");
            System.out.println("2. Öğrenci Sil");
            System.out.println("3. Öğrenci Sayısını Bul");
            System.out.println("4. Öğrenci Ara");
            System.out.println("5. Tüm Öğrencileri Listele");
            System.out.println("6. Çıkış yap");
            System.out.println("");
            System.out.println("***********************************************");
            System.out.println("//////////////////ozgurseng////////////////////     ");
            System.out.println("***********************************************");
            System.out.println("");
            System.out.print("Seçiminizi yapın: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Öğrenci Numarasını Giriniz            : ");
                    int numara = scanner.nextInt();
                    System.out.print("Öğrenci Ad Soyadını Giriniz           : ");
                                        String ad = scanner.next();
                    System.out.print("Öğrencinin Vize Notunu Giriniz        : ");
                    short okvize = scanner.nextShort();
                    System.out.print("Öğrencinin Final Notunu Giriniz       : ");
                    short okfinal = scanner.nextShort();
                    bagliListe.sonunaEkle(ad, numara,okvize,okfinal);
                    break;

                case 2:
                    System.out.print("Silmek istediğiniz öğrencinin numarasını girin   : ");
                    int silinecekNumara = scanner.nextInt();
                    bagliListe.ogrenciSil(silinecekNumara);
                    break;

                case 3:

                    int ogrenciSayisi = bagliListe.ogrenciSayisi();
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("!!!             TOPLAM OGRENCI SAYISI       !!!");
                    System.out.println("!!!                       "+ogrenciSayisi+"                 !!!");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                    break;

                case 4:
                    System.out.print("Aranacak öğrencinin adını soyadını girin: ");
                    String arananAdSoyad = scanner.next();
                    bagliListe.ogrenciArama(arananAdSoyad);
                    break;

                case 5:
                    bagliListe.ogrenciListele();
                    break;

                case 6:
                    System.out.println("Çıkış yapılıyor...");

                    break;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        } while (secim != 6);
        scanner.close();
    }
}
