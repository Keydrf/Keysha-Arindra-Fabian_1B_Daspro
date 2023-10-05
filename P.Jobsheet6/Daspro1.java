import java.util.Scanner;
public class Daspro1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int bil1, bil2, bil3;
        System.out.print("Masukkan bilangan 1: ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = input.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = input.nextInt();
        if(bil1 >= bil2 && bil1 >= bil3){
            System.out.println(bil1+" bilangan terbesar");
        }else if(bil2 >= bil1 && bil2 >= bil3){
                System.out.println(bil2+" bilangan terbesar ");
        }else{
            System.out.println(bil3+" bilangan terbesar");
        }
        
    }
}
