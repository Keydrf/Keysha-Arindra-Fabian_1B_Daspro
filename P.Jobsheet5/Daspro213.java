import java.util.Scanner;
public class Daspro213 {
    public static void main(String[] args){
        Scanner input2 = new Scanner(System.in);
        String username, password, output;
    

        System.out.print("Masukkan username: ");
        username = input2.next().toString();
        System.out.print("Masukkan password: ");
        password = input2.next().toString();

        if(username.equals("keysha") && password.equals("apakahbenar")){
            System.out.println("Username dan password benar! ");
        }
        else{
            System.out.println("Username dan password salah! ");
        }
        
    }
}
