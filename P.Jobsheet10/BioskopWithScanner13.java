import java.util.Scanner;

public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        boolean kembali = false;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("Silahkan pilih menu (1/2/3)");
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: Exit");
            menu = input2.nextInt();

            if (menu == 1) {
                for (int i = 0; i < penonton.length; i++) {

                    System.out.print("Masukkan nama: ");
                    nama = input1.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = input2.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = input2.nextInt();

                    if (baris >= 0 && baris < penonton.length && kolom <= penonton[i].length) {
                        if (penonton[baris - 1][kolom - 1] == null || penonton[baris-1][kolom-1] == "***") {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Kursi berhasil dimasukkan");
                        }else{
                            System.out.println("Kursi sudah terisi");
                            System.out.print("Masukkan baris: ");
                            baris = input2.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = input2.nextInt();
                            penonton[baris - 1][kolom - 1] = nama;
                        }
                    }
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = input1.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;

                    }
                    
                }

            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = "***";
                        }
                        // if (i<penonton[j].length){
                        // ++i;
                        // ++j;
                        // }else {
                        // break;
                        // }

                    }
                    System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));

                }
            } else if (menu == 3) {
                System.out.println("Terimakasih. Program selesai.");
            }

            System.out.println("Apakah ingin memilih menu lain? (y/n)");
            String konfir = input1.nextLine();
            if (konfir.equalsIgnoreCase("y")) {
                kembali = true;
            } else {
                System.out.println("Terimakasih, have a nice day");
                break;
            }
        }
    }

}
