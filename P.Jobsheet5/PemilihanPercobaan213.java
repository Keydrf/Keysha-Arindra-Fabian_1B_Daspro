import java.util.Scanner;
public class PemilihanPercobaan213 {
    public static void main(String[] args){
    Scanner input01 = new Scanner(System.in);
    System.out.println("Nilai uas     : ");
    float uas = input01.nextFloat();
    System.out.println("Nilai uts     : ");
    float uts = input01.nextFloat();
    System.out.println("Nilai kuis    : ");
    float kuis = input01.nextFloat();
    System.out.println("Nilai tugas   : ");
    float tugas = input01.nextFloat();    

    float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
    if (total > 80){
        System.out.println("Nilai akhir "+total+ " dan anda mendapatkan A");
    }
    else if(total > 73){
        System.out.println("Nilai akhir "+total+ " dan anda mendapatkan B+");
    }
    else if(total > 65){
        System.out.println("Nilai akhir "+total+ " dan anda mendapatkan B");
    }
    else if(total > 60){
        System.out.println("Nilai akhir "+total+ " dan anda mendapatkan C+");
    }
    else if(total > 50){
        System.out.println("Nilai akhir "+total+ " dan anda mendapatkan C");
    }
    else if(total > 39){
        System.out.println("Nilai akhir "+total+ " dan anda mendapatkan D");
    }
    else if(total <= 39){
        System.out.println("Nilai akhir "+total+ " dan anda mendapatkan E");
    }
    // String message = total > 80 ? "A" : "B";
    

//     System.out.println("Nilai akhir = " +total+" sehingga " + message);
}
    
}
