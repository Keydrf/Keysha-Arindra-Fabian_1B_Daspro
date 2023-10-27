import java.util.Scanner;
public class ArrayRataNilai13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = input.nextInt();
        int [] nilaiMhs = new int[jml];
        double totalnilailulus = 0, totalnilaitidaklulus = 0, jmllulus = 0, jmltidaklulus = 0;
        
        for(int i =0; i<jml; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input.nextInt();
            if (nilaiMhs[i]>70){
                totalnilailulus += nilaiMhs[i];
                jmllulus++;
            } else{
                totalnilaitidaklulus += nilaiMhs[i];
                jmltidaklulus++;
            }
        }
        
       if (jmllulus>0){
        double ratalulus = totalnilailulus / jmllulus;
        System.out.println("Rata-rata nilai lulus = "+ratalulus);
       } else{
        System.out.println("Tidak ada mahasiswa yang lulus");
       }
       if (jmltidaklulus>0){
        double ratatidaklulus = totalnilaitidaklulus / jmltidaklulus;
        System.out.println("Rata-rata nilai tidak lulus = "+ratatidaklulus);
       } else {
           System.out.println("Tidak ada mahasiswa yang tidak lulus.");
       }
        // rata2 = total / nilaiMhs.length;
        // System.out.println("Rata-rata nilai = "+rata2);
        
    }
}
