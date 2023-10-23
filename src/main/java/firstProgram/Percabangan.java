package firstProgram;

import java.util.Scanner;

public class Percabangan {
    public  static  void  main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter Password: ");
        String validPassword = "password";

        if (password.equals(validPassword)){
            System.out.println("Selamat datang");
        }else{
            System.out.println("Coba lagi");
        }

        System.out.println("Terima kasih");
    }

    public  static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return  scanner.nextLine();
    }
}
