import java.util.Scanner;
public class Daspro113 {
    public static void main(String[] args){
    Scanner input1 = new Scanner(System.in);

    String hasil;
    System.out.print("Masukkan jarak serang per meter: ");
    int jarak = input1.nextInt();

    hasil = (jarak <= 5) ? "Meele weapon" : "Range weapon";

    System.out.println("Anda menggunakan senjata "+hasil);
    }
}
