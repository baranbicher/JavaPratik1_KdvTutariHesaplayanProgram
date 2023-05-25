import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Fiyat = new Scanner(System.in);
        double urunfiyat, kdvOrani = 0.18, kdvOrani1 = 0.08;
        System.out.print("Ürünün Fiyatını Girin:");
        urunfiyat = Fiyat.nextDouble();
        double kdvSonuc = urunfiyat <=1000 ? urunfiyat*0.18 : urunfiyat*0.08;
        double kdvliTutar = urunfiyat + kdvSonuc;

        System.out.println("KDV'siz Tutar: " + urunfiyat);
        System.out.println("KDV Oranları. " + kdvOrani + " " + kdvOrani1);
        System.out.println("Ürünün KDV'si: " + kdvSonuc);
        System.out.println("Ürünün KDV'li Tutarı: " + kdvliTutar);
    }
}