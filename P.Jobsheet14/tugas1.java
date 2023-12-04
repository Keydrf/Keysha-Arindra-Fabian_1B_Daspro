import java.util.Scanner;
public class tugas1 {
    static String deretRecrusif(int n) {
        if (n >= 0) {
            if (n == 0) {
                return Integer.toString(n);
            } else {
                return n + " " + deretRecrusif(n - 1);
            }
        }
        return " ";
    }

    static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        System.out.println("\n\nDeret descending rekursif dari " + angka + " sampai 0: ");
        String hasil = deretRecrusif(angka);
        System.out.println(hasil);
        System.out.println("\n\nDeret descending iteratif dari " + angka + " sampai 0: ");
        deretIteratif(angka);
    }
}
