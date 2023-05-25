import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Fiyat = new Scanner(System.in);
        double urunfiyat, kdvOranı = 0.18, kdvOranı1 = 0.08;
        System.out.print("Ürünün Fiyatını Girin:");
        urunfiyat = Fiyat.nextDouble();
        double kdvSonuc = urunfiyat <=1000 ? urunfiyat*0.18 : urunfiyat*0.08;
        double kdvliTutar = urunfiyat + kdvSonuc;

        System.out.println("KDV'siz Tutar: " + urunfiyat);
        System.out.println("KDV Oranları. " + kdvOranı + " " + kdvOranı1);
        System.out.println("Ürünün KDV'si: " + kdvSonuc);
        System.out.println("Ürünün KDV'li Tutarı: " + kdvliTutar);
    }
}