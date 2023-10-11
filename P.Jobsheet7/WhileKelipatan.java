import java.util.Scanner;
public class WhileKelipatan {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        int kelipatan, jumlah, counter;
        float rata;
        rata = 0;
        jumlah = 0;
        counter = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = input13.nextInt();
        int i = 1;
        while (i <= 50){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
                rata = jumlah / counter;
                System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
                System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
                System.out.printf("Rata-rata dari kelipatan %d adalah %.3f\n", kelipatan, rata);
            }i++;
        }
    }
        // for (int i = 1; i <= 50; i++) {
        //     if (i % kelipatan == 0) {

                
        //     }
            
}

