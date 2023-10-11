import java.util.Scanner;
public class DoWhileCuti13 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();
        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = scan.nextLine();
            if(konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: "+jatahCuti);
                }else{
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    
                }
            } else if(konfirmasi.equalsIgnoreCase("t")){
                System.out.println("Terimakasih telah menggunakan sistem cuti");
                break;
            } else {
                System.out.println("Maaf huruf yang anda masukkan tidak bisa diakses");
                break;
            }
        }while (jatahCuti > 0);
    }
}
