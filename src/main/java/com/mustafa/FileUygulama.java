package com.mustafa;
/*
        isimlistesi.txt dosyamız olacak

        bu dosyayı okuyp baska bir dosyaya yazacagız  secilecekler.txt dosyasına
        daha sonra islemler yapıp birtane veri secip bu veri secilmisler.txt dosyasına ekleyeceğiz

        bu 3 dosya isçin bir sabitler sınıfı olusturalım

        OgrenciFileISlemler sınfımız olsun bu sınıfda bir ogrenci listesi tutalım
        1- dosyadan veri okuma ==> dosyadan okudugumuz(isimlistesi.txt) veriyi listeye ekleyeceğiz
        2-ogrenci listemizdeki verileri secilecekler.txt dosyasına yazdıracagız;
        3-ogrenci sec metodu yazalım==> buda listemizden rastgele ogrenci secmek için bir index degeri donsun
     !  4-secilen ogrenciyi  secilmisler.txt dosyasına yazdıralım ve aynı zmanda secilecler.txt de dosyasından cıkartalım
        rastgele ogrenci secilecek rastgele ogrenci sec metodu ile beraber gelen indexden daha sonra bu veri secilmisler.txt aktarılacak
        secilecekler.txt guncellenecek
 */
public class FileUygulama {
    public static void main(String[] args) {
        OgrenciFileIslemler ogrenciFileIslemler = new OgrenciFileIslemler();
        ogrenciFileIslemler.secileceklereYazdir();

    }
}
