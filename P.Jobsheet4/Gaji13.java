import java.util.Scanner;
public class Gaji13 {
    public static void main (String[] args){
    Scanner get = new Scanner(System.in);
    int jmlMasuk, jmlTdkMasuk, TotGaji;
    int gaji, potGaji;

    System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
    jmlMasuk = get.nextInt();
    System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
    jmlTdkMasuk = get.nextInt();
    System.out.println("Masukkan Jumlah Gaji Per Hari");
    gaji = get.nextInt();
    System.out.println("Masukkan Jumlah Potongan Gaji Per Hari");
    potGaji = get.nextInt();

    TotGaji = (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);

    System.out.println("Gaji yang anda terima adalah " + TotGaji);
    }
}
