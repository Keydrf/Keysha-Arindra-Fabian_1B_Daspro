import java.util.Scanner;
public class tugas3 {
    static boolean cekPrimaRekrusif(int n, int pembagi){
        if(n<=2){
            return (n == 2);
        }
        if (n % pembagi == 0){
            return false;
        }
        if (pembagi * pembagi > n){
            return true;
        }
        return cekPrimaRekrusif(n, pembagi+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang akan di cek: ");
        int bil = sc.nextInt();
        boolean result = cekPrimaRekrusif(bil, 2);

        if(result){
            System.out.println(bil + " adalah bilangan prima.");
        } else{
            System.out.println(bil + " bukan bilangan prima.");
        }
    }
}
