import java.util.Scanner;

public class LinearSearch13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key, hasil = 0, array;

        System.out.print("Masukkan jumlah elemen array: ");
        array = input.nextInt();

        int[] arrayInt = new int[array];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + ": ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        key = input.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        if(hasil != 0){
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        } else{
            System.out.println("Key tidak ditemukan");
        }
        
        input.close();

    }
}
