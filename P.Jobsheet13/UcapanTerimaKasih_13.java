import java.util.Scanner;
public class UcapanTerimaKasih_13 {
    static Scanner sc = new Scanner(System.in);
    public static String PenerimaUcapan() {
        System.out.println("Tuliskan NAMA orang yang ingin anda berikan ucapan");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }
    public static String UcapanTambahan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan ucapan tambahan yang akan diberikan");
        String ucapan = sc.nextLine();
        sc.close();
        return ucapan;
        
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        String tambahan = UcapanTambahan();
        System.out.println("Thank you "+nama+" "+tambahan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }

}
