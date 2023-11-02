import java.util.Scanner;
public class tugasarray13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int elemen;

        System.out.print("Masukkan jumlah array: ");
        elemen = sc.nextInt();

        int [] arr = new int[elemen];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Masukkan nilai array ke-"+i+": ");
            arr[i] = sc.nextInt();
        }
    
        int max = arr[0], min = arr[0], sum = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }

        double average = (double) sum / elemen;
        System.out.println("Nilai tertinggi: "+max);
        System.out.println("Nilai terendah: "+min);
        System.out.println("Nilai rata-rata: "+average);
    }
}
