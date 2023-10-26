import java.util.Scanner;
public class soalA {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        System.out.println("Masukkan jumlah calon mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        // input.nextLine();
        
        for(int i = 1; i<= jumlahMahasiswa; i++){
            System.out.println("Data Calon Mahasiswa Ke-"+i);
            System.out.print("Masukkan jurusan asal(IPA/IPS/Bahasa): ");
            String jurusan = input1.nextLine();

            System.out.print("Masukkan nilai matematika: ");
            double matematika = input.nextDouble();
            System.out.print("Masukkan nilai Fisika: ");
            double fisika = input.nextDouble();
            System.out.print("Masukkan nilai Bahasa Inggris: ");
            double inggris = input.nextDouble();
            System.out.print("Masukkan nilai Bahasa Indonesia: ");
            double indonesia = input.nextDouble();

            double rataRapot = (matematika + fisika + inggris + indonesia) / 4.0;

            String prodi = "Tidak lolos seleksi";
            if(jurusan.equalsIgnoreCase("IPA")){
                if(matematika >= 80 && rataRapot>= 80){
                    prodi = "D4 TI";
                } else if(matematika>=70 && fisika>=70){
                    prodi = "D3 MI";
                }
            } else if (jurusan.equalsIgnoreCase("IPS")){
                if(matematika>=80 && rataRapot>=80){
                    prodi = "D4 TI";
                }
            } else if(jurusan.equalsIgnoreCase("Bahasa")){

                if(rataRapot>80 && matematika>=70 && inggris>=70 && indonesia>=70){
                    prodi = "D3 MI";
                }
            }
            System.out.println("Diterima di prodi: "+prodi);
            // if(i < jumlahMahasiswa){
            //     input.nextLine();
            // }
        }
    }
}
