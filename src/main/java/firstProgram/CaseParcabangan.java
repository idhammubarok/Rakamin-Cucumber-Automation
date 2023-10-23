package firstProgram;

import java.util.Scanner;

public class CaseParcabangan {
    public  static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan nilai :");

        int nilai = scanner.nextInt();
        String grade;

        if (nilai > 90) {
            grade = "A";
        } else if (nilai > 80) {
            grade = "B+";
        } else if (nilai > 70) {
            grade = "B";
        } else {
            grade = "D";
        }

        System.out.println("Grade anda adalah:" + grade);

    }
}
