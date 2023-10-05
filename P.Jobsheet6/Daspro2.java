import java.util.Scanner;

public class Daspro2 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan jenis buku: ");
        String jenisbuku = input13.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahbuku = input13.nextInt();
        if (jenisbuku.equalsIgnoreCase("kamus")) {

            if (jumlahbuku > 2) {
                System.out.println("Mendapat diskon 10% dan tambahan diskon 2%");
            } else {
                System.out.println("Mendapat diskon 10%");
            }
        } else if (jenisbuku.equalsIgnoreCase("novel")) {

            if (jumlahbuku > 3) {
                System.out.println("Mendapat diskon 7% dan tambahan diskon 2%");
            } else if (jumlahbuku <= 3) {
                System.out.println("Mendapat diskon 7% dan tambahan diskon 1%");
            } else {
                System.out.println("Mendapatkan diskon 7%");
            }
        } else {
            if (jumlahbuku > 3) {
                System.out.println("Mendapatkan diskon 5%");
            } else {
                System.out.println("Tidak mendapatkan diskon");
            }
        }
    }
}
