import java.util.Scanner;

public class nilai13 {
    static String nilai[][];

    public static void main(String[] args) {
        Scanner inputHuruf = new Scanner(System.in);
        Scanner inputAngka = new Scanner(System.in);
        String nama, nilaimhs;
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = inputAngka.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = inputAngka.nextInt();

        nilai = new String[jumlahMahasiswa][jumlahTugas + 1];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nama mahasiswa: ");
                nama = inputHuruf.nextLine();
                nilai[i][0] = nama;
            for (int j = 1; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai minggu ke-" + j+": ");
                nilaimhs = inputHuruf.nextLine();
                nilai[i][j] = nilaimhs;
            }
        }
        hasilNilai();
        int indexMahasiswaTertinggi = cariMahasiswaTertinggi();
        tampilkanMahasiswaTertinggi(indexMahasiswaTertinggi);
    }

    static void hasilNilai(){
        for(int i = 0; i < nilai.length; i++){
            System.out.println("Nama: "+nilai[i][0]);
            for(int j = 1; j < nilai[i].length; j++){
                System.out.println("Minggu ke-"+j+": "+nilai[i][j]);
            }
        }
        
    }
    
    static int cariMahasiswaTertinggi() {
        int totalNilaiMahasiswa[] = new int[nilai.length];

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 1; j < nilai[i].length; j++) {
                totalNilaiMahasiswa[i] += Integer.parseInt(nilai[i][j]);
            }
        }

        int indexMahasiswaTertinggi = 0;
        int maxNilai = totalNilaiMahasiswa[0];

        for (int i = 1; i < totalNilaiMahasiswa.length; i++) {
            if (totalNilaiMahasiswa[i] > maxNilai) {
                maxNilai = totalNilaiMahasiswa[i];
                indexMahasiswaTertinggi = i;
            }
        }

        return indexMahasiswaTertinggi;
    }
    static void tampilkanMahasiswaTertinggi(int index) {
        System.out.println("Mahasiswa dengan nilai tertinggi: " + nilai[index][0]);
        System.out.println("Nilai dari minggu ke-");
        for (int j = 1; j < nilai[index].length; j++) {
            System.out.println("Minggu ke-" + j + ": " + nilai[index][j]);
        }
    }
    
    static int cariMingguTerbaik() {
        int mingguTerbaik = 1;
        int maxNilai = 0;

        for (int j = 1; j < nilai[0].length; j++) {
            int totalNilaimingguIni = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalNilaimingguIni += Integer.parseInt(nilai[i][j]);
            }

            if (totalNilaimingguIni > maxNilai) {
                maxNilai = totalNilaimingguIni;
                mingguTerbaik = j;
            }
        }

        return mingguTerbaik;
    }


}
