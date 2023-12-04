/*
 * Student Registration Automation [ Basic - Java C++/C# - Practice assignment]
 * ozgurseng
 * https://github.com/ozgurseng
 *
 * BagliListe.java
 */

public class BagliListe {
    Ogrenci baslangic;
    Ogrenci sonraki;

    public BagliListe() {
        this.baslangic = null;
         this.sonraki = null;
    }

    public void sonunaEkle(String ad, int numara, short okvize,
            short okfinal) {
        Ogrenci yeniOgrenci = new Ogrenci(ad, numara,okvize,okfinal);

        if (baslangic == null) {
            baslangic = yeniOgrenci;
        } else {
            Ogrenci temp = baslangic;
            while (temp.sonraki != null) {
                temp = temp.sonraki;
            }
            temp.sonraki = yeniOgrenci;
        }
        System.out.println("");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!    OGRENCI KAYDI BASARIYLA YAPILDI.     !!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("");

    }

    public void ogrenciListele() {
        Ogrenci temp = baslangic;
        while (temp != null) {
            System.out.println("");
            System.out.println("--------------------------");

            System.out.println("Öğrenci Bilgileri:");
            System.out.println("Öğrenci No: " + temp.ogrenciNumarasi);
            System.out.println("Adı Soyadı: " + temp.ogrenciAdiSoyadi);
            System.out.println("Vize Notu: " + temp.ogrenciVizeNotu);
            System.out.println("Final Notu: " + temp.ogrenciFinalNotu);
            System.out.println("Ders Durumu: " + temp.ogrenciDersDurum);
            System.out.println("");
            System.out.println("--------------------------");
            temp = temp.sonraki;
        }
    }

    public void ogrenciSil(int numara) {
        if (baslangic == null) {
            System.out.println("");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("!!!        LISTEDE OGRENCI BULUNAMADI       !!!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("");

            return;
        }

        if (baslangic.ogrenciNumarasi == numara) {
            baslangic = baslangic.sonraki;
        System.out.println("");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!        OGRENCI BASARIYLA SILINDI        !!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("");

            return;
        }

        Ogrenci onceki = baslangic;
        Ogrenci temp = baslangic.sonraki;

        while (temp != null && temp.ogrenciNumarasi != numara) {
            onceki = temp;
            temp = temp.sonraki;
        }

        if (temp == null) {
            System.out.println("");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("!!!        LISTEDE OGRENCI BULUNAMADI       !!!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("");
        } else {
            onceki.sonraki = temp.sonraki;
            System.out.println("");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("!!!        OGRENCI BASARIYLA SILINDI        !!!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("");
        }
    }

    public int ogrenciSayisi() {
        int sayac = 0;
        Ogrenci temp = baslangic;
        while (temp != null) {
            sayac++;
            temp = temp.sonraki;
        }
        return sayac;
    }

    public void ogrenciArama(String adSoyad) {
        if (baslangic == null) {
            System.out.println("");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("!!!        LISTEDE OGRENCI BULUNAMADI       !!!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("");
            return;
        }

        Ogrenci temp = baslangic;
        while (temp != null) {
            // Öğrencinin ad ve soyadı ile arama
            if (temp.ogrenciAdiSoyadi.equalsIgnoreCase(adSoyad)) {

                System.out.println("");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!!!             OGRENCI BILGILERI           !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("");
                System.out.println("--------------------------");
                System.out.println("");
                System.out.println("Öğrenci No  : " + temp.ogrenciNumarasi);
                System.out.println("Öğrenci     : " + temp.ogrenciAdiSoyadi);
                System.out.println("Vize Notu   : " + temp.ogrenciVizeNotu);
                System.out.println("Final Notu  : " + temp.ogrenciFinalNotu);
                System.out.println("Ders Durumu : " + temp.ogrenciDersDurum);
                System.out.println("");
                System.out.println("--------------------------");

                return;
            }
            temp = temp.sonraki;
        }

            System.out.println("");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("!!!        LISTEDE OGRENCI BULUNAMADI        !!!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("");
    }

}
