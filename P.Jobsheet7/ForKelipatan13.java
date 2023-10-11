import java.util.Scanner;
public class ForKelipatan13{
    public static void main(String [] args){
        Scanner input13 = new Scanner(System.in);
        int total, kelipatan, jumlah, counter;
        jumlah = 0;
        counter = 0;
        System.out.print("Masukkan bilangan kelipatan: ");
        kelipatan = input13.nextInt();
        for(int i = 1; i <= 50; i++){
            if(i % kelipatan == 0){
                
                jumlah += i;
                counter++;
            }
            System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
            System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        }
    }
}