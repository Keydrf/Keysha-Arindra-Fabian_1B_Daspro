import java.util.Scanner;

public class soalC {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double TesPotensiAkademik, TesBahasaInggris, TesWawancara, nilaiAkhir, Ratarata;
        int JumlahCalonMahasiswa;
       
        //input data calon mahasiwa ke-
        System.out.print("Masukkan jumlah calon mahasiswa: ");
         JumlahCalonMahasiswa = input.nextInt();
        //  input.nextLine(); 
 
         for (int i = 1; i <= JumlahCalonMahasiswa; i++) {
             System.out.println("\nData Calon Mahasiswa ke-" + i);

        //input nilai petensi akademik
        System.out.print("Masukkan nilai tes potensi akademik: ");
        TesPotensiAkademik = input.nextDouble();
        //input nilai bahasa inggris 
        System.out.print("Masukkan nilai tes bahasa inggris: ");
        TesBahasaInggris = input.nextDouble();
        //input nilai tes wawancara
        System.out.print("Masukkan nilai tes wawancara:");
        TesWawancara = input.nextDouble();

        //Total nilai akhir
        nilaiAkhir = (TesPotensiAkademik * 0.5) + (TesBahasaInggris * 0.3) + (TesWawancara * 0.2);
        System.out.print("Nilai akhir tes anda adalah " + nilaiAkhir);

        //Menghitung Rata rata
        Ratarata = ((TesPotensiAkademik + TesBahasaInggris + TesWawancara) / 3.0 );

        //Menentukan prodi berdasarkan syarat
        String prodi = "Tidak lolos seleksi";

        if(TesBahasaInggris > 70 && TesWawancara > 80){
            prodi = "Sistem Informasi";
        }else if (TesPotensiAkademik > 70 && TesBahasaInggris > 70 && TesWawancara > 70 ){
             prodi = "Ilmu Komunikasi";
        }else if (Ratarata <= 75 && TesBahasaInggris > 50){
            prodi = "Bisnis Manajemen";
        }else if( TesPotensiAkademik <= 100 && TesBahasaInggris <= 100){
            prodi = "Teknk Informatika";
        }
        
        //Menampilkan lulus di prodi
        System.out.println("\nDiterima di prodi " + prodi);

        // if (i < JumlahCalonMahasiswa) {
        //     input.nextLine(); 
        // }
    }

    input.close();

    }
}