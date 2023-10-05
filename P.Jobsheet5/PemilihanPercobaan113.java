import java.util.Scanner;

public class PemilihanPercobaan113{
    public static void main(String [] args){
        Scanner input00 = new Scanner(System.in);
        String hasil;
        System.out.println("Masukkan angka: ");
        int angka = input00.nextInt();

        // if(angka %2 == 0){
        //                 hasil="bilangan genap";
        // }

        // else{
        //     hasil="bilangan ganjil";
        // }
        hasil = (angka %2 == 0) ? "bilangan genap" : "bilangan ganjil";

        System.out.println(+angka+ " adalah " +hasil);
    }
}