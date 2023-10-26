import java.util.Scanner;

public class percobaan {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        Scanner masuk1 = new Scanner(System.in);
        System.out.println("=== UTS DASPRO ===");
        System.out.println("Dibuat oleh: Keysha Arindra Fabian");
        System.out.println("NIM: 2341760193");
        System.out.println("=========================================");

        int menuSatu = -1;

        boolean ulangi = true;
        while (menuSatu != 1) {

            boolean datapeminjaman = false;
            // int menuSatu = -1;
            System.out.println("Pilih Menu (1/2) : ");
            System.out.println("1. Data Peminjam");
            System.out.println("2. Data Rental");
            menuSatu = masuk.nextInt();
            switch (menuSatu) {
                case 1:
                    System.out.println("Berhasil mengakses menu data peminjam");
                    datapeminjaman = true;
                    if (datapeminjaman) {
                        String nama, alamat, nohp, jenismobil, supir;
                        int lama;
                        System.out.println("=========================================");
                        System.out.println("Data Peminjam");
                        System.out.println("=========================================");
                        System.out.println("Nama: ");
                        nama = masuk1.nextLine();
                        System.out.println("Alamat: ");
                        alamat = masuk1.nextLine();
                        System.out.println("No hp: ");
                        nohp = masuk1.nextLine();
                        System.out.println("Jenis mobil (avanza/innova/fortuner): ");
                        jenismobil = masuk1.nextLine();
                        System.out.println("Lama rental: ");
                        lama = masuk.nextInt();
                        System.out.println("Apakah menggunakan supir? (y/t): ");
                        supir = masuk1.nextLine();
                        System.out.println("Apa");
            }
                    break;
                case 2:
                    System.out.println("Anda harus mengisi menu data peminjam terlebih dahulu");
                    System.exit(0);
                    // System.out.println("Kembali ke menu? (y/t): ");
                    // String jawab;
                    // jawab = masuk1.nextLine();
                    // if (!jawab.equalsIgnoreCase("y")) {
                    //     ulangi = false;
                    // }
                    // System.exit(0);
                default:
                    break;
                    
                }
        } while (ulangi);
    }
}
