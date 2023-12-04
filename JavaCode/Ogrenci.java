/*
 * Student Registration Automation [ Basic - Java C++/C# - Practice assignment]
 * ozgurseng
 * https://github.com/ozgurseng
 *
 * Ogrenci.java
 */

public class Ogrenci {
    int ogrenciNumarasi;
    String ogrenciAdiSoyadi;
    short ogrenciVizeNotu;
    short ogrenciFinalNotu;
    String ogrenciDersDurum;
    Ogrenci sonraki;

    public Ogrenci(String ad, int numara, short okvize, short okfinal) {
        this.ogrenciAdiSoyadi = ad;
        this.ogrenciNumarasi = numara;
        this.ogrenciVizeNotu = okvize;
        this.ogrenciFinalNotu = okfinal;
        this.sonraki = null;
        this.ogrenciDersDurum = (ogrenciVizeNotu * 0.4 + ogrenciFinalNotu * 0.6 >= 50) ? "Geçti" : "Kaldı";

    }
}
