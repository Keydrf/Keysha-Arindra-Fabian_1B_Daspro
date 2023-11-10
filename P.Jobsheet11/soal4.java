import java.util.Arrays;
import java.util.Scanner;
public class soal4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String atlet[][] = new String[4][6];
        String cabor, nama;
        for(int i = 0; i < atlet.length; i++){ //perulangan baris
            System.out.println("Cabang olahraga ke-"+(i+1)+": ");
            cabor = input.nextLine(); //input cabang olahraga
            atlet[i][0] = cabor; //memasukkan cabang olahraga ke dalam array
            for(int j = 1; j< atlet[i].length; j++){ //perulangan kolom
                System.out.println("Nama atlet ke-"+j+": ");
                nama = input.nextLine(); //input nama atlet
                atlet[i][j] = nama; //memasukkan nama ke dalam array
            }
        }
        for (int i = 0; i < atlet.length; i++) {
            Arrays.sort(atlet[i], 1, atlet[i].length); //mengurutkan array dari huruf a-z
        }

        
        System.out.println("Data Atlet:"); //menampilkan isi array
        for (int i = 0; i < atlet.length; i++) { 
            System.out.println("Cabang Olahraga ke-" + (i + 1)+" "+atlet[i][0]);
            for (int j = 1; j < atlet[i].length; j++) {
                System.out.println("Atlet ke-" + j + ": " + atlet[i][j]);
            }
            System.out.println();//menampilkan isi array berdasarkan sortingan
        }
    }
}
