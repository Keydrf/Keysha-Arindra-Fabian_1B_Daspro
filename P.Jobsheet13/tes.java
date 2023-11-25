import java.util.Scanner;
public class tes {
 public static void main(String[] args) {
   String nama, nim;
   Scanner sc = new Scanner(System.in);
   nim = sc.nextLine();
   nama = sc.nextLine();
   
   cetak(nim, nama);
 }  
 static void cetak(String a, String b){
    System.out.println(a);
    System.out.println(b);
 }  
}
