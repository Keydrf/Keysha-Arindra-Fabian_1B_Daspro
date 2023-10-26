import java.util.Scanner;

public class uts13 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        double akademik, bing, nasionalisme, total;
        int jumlahpeserta;
        System.out.println("==============================================");
        System.out.print("Masukkan jumlah peserta: ");
        jumlahpeserta = input1.nextInt();
        for (int j = 1; j <= jumlahpeserta; j++) {
            System.out.println("==============================================");
            System.out.println("Data peserta ke-" + j);
            System.out.print("Masukkan nilai tes akademik: ");
            akademik = input1.nextDouble();
            System.out.print("Masukkan nilai tes bahasa inggris: ");
            bing = input1.nextDouble();
            System.out.print("Masukkan nilai tes nasionalisme: ");
            nasionalisme = input1.nextDouble();
            total = (akademik + bing + nasionalisme) / 3.0;
            System.out.println("Rata-rata nilai adalah: " + total);
            if (akademik >= 75 && bing >= 75 && nasionalisme >= 75) {
                if (total >= 78) {
                    double ipk;
                    String surat, cek;
                    System.out.println("Selamat anda lolos tahap seleksi");
                    System.out.println("==============================================");
                    System.out.println("Silahkan isi tahapan kelengkapan berkas");
                    System.out.print("Masukkan nilai ipk: ");
                    ipk = input1.nextDouble();
                    System.out.print("Surat keterangan sehat (y/t): ");
                    surat = input2.nextLine();
                    if(surat.equalsIgnoreCase("y")){
                        System.out.print("Cek apakah peserta sehat jasmani dan rohani (y/t): ");
                        cek = input2.nextLine();
                        if (ipk >= 3.25) {
                        if (surat.equalsIgnoreCase("y") && cek.equalsIgnoreCase("y")) {
                            System.out.println("Selamat anda lolos tahapan kelengkapan berkas");
                        } else {
                            System.out.println("Mohon maaf anda tidak lolos tahap kelengkapan berkas");
                        }
                    } else {
                        System.out.println("Mohon maaf anda tidak lolos tahap kelengkapan berkas");
                    }
                    } else{
                        System.out.println("Mohon maaf anda tidak lolos tahap kelengkapan berkas");
                    }                   
                }
            } else {
                System.out.println("Mohon maaf anda tidak lolos tahap seleksi");
            }
        }

    }
}
