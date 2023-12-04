import java.util.Scanner;
public class tugas4 {
    static int hitungMarmut(int n) {
       if (n <= 3) {
            return 1;
        } else {
            return hitungMarmut(n - 1) + hitungMarmut(n - 2);
        }
    }

    static int jumlahPasanganMarmut(int bulaan) {
        return hitungMarmut(bulaan + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan: ");
        int bulan = sc.nextInt();
        int jml = jumlahPasanganMarmut(bulan);
        System.out.println("pada bulan ke-" + bulan + " jumlah pasangan marmut adalah " + jml);
    }
}
