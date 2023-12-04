import java.util.Scanner;
public class percobaan2 {
    static int hitungPangkat(int x, int y){
        if(y==0){
            return(1);
        } else{
            return (x * hitungPangkat(x, y-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();
        
        System.out.println(hitungPangkat(bilangan, pangkat));
        cetak(bilangan, pangkat, 1);
        
    }
    
    static void cetak(int x, int y, int current) {
        if (current < y) {
            System.out.print(x + "x");
            cetak(x, y, current + 1);
        } else if (current == y) {
            System.out.println(x + "x1 = " + hitungPangkat(x, y));
        }
    }

    // static void cetak(){
    //     System.out.println(hitungPangkat(2, 5));
    // }

}
