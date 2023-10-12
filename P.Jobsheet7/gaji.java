import java.util.Scanner;
public class gaji {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur=0, totalGajiLembur=0;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;
        while (i < jumlahKaryawan){
            System.out.println("Pilihan jabatan - Direktur - Manajer - Karyawan");
            System.out.println("Masukkan jumlah jam lembur: ");
            jabatan = scan.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            } else if(jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jumlahJamLembur * 100000;
            } else if(jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
            } else{
                i -= 1;
                System.out.println("Jabatan invalid");
                continue;
            }
            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur: " +totalGajiLembur);
        }
    }
}
