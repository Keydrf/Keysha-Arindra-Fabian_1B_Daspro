import java.util.Scanner;
public class HargaBayar13 {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        int harga, jumlah;
        double dis, total, bayar, jmlDis;
        String merkBuku, jmlHalaman;

        System.out.println("Masukkan merek buku yang dibeli ");
        merkBuku = input.next();
        System.out.println("Masukkan jumlah halaman buku yang dibeli ");
        jmlHalaman = input.next();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan jumlah diskon yang didapatkan ");
        dis = input.nextDouble();

        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis;

        System.out.println("Buku yang anda beli adalah " +merkBuku);
        System.out.println("Jumlah halaman buku anda adalah " +jmlHalaman);
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
    
}
