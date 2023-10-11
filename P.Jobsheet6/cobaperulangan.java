import java.util.Scanner;
public class cobaperulangan {
    public static void main(String[] args){
        String username, password;
        Scanner input3 = new Scanner(System.in);
        System.out.println("Masukkan username: ");
        username = input3.nextLine();
        System.out.println("Masukkan password: ");
        password = input3.nextLine();
        if(username.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("adm123")){
            do{
                System.out.println("silahkan pilih aktivitas dibawah ini (1/2/3/4/5)");
                System.out.println("1. Meminjam buku");
                System.out.println("2. Mengembalikan buku");
                char kondisi;
                kondisi = input3.next().charAt(0);
                switch (kondisi) {
                    case '1':
                        String nama, nim, judul, kode;
                        int jumlah;
                        System.out.println("masukkan nama: ");
                        nama = input3.nextLine();
                        System.out.println("masukkan nim: ");
                        nim = input3.nextLine();
                        System.out.println("masukkan judul: ");
                        judul = input3.nextLine();
                        System.out.println("masukkan kode buku: ");
                        kode = input3.nextLine();
                        System.out.println("masukkan jumlah buku: ");
                        jumlah = input3.nextInt();
                        System.out.println("nama "+nama+" nim "+nim+" kode buku "+kode+" jumlah "+jumlah);
                        break;
                
                    default:
                        break;
                }while{}
            }
        }
    }
}
