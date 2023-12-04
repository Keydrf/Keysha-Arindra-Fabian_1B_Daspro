import java.util.Scanner;
public class tugas2 {
    static int hitungJumlah(int bil){
        if(bil == 1){
            return 1;
        } else{
            return(bil+hitungJumlah(bil-1));
        }
    }
    
    static void cetak(int x, int current) {
        if (current < x) {
            System.out.print(current + "+");
            cetak(x, current + 1);
        } else if (current == x) {
            System.out.println(current + "=" + hitungJumlah(x));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();
        cetak(bilangan, 1);
    }
}
