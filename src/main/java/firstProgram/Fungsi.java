package firstProgram;
import  firstProgram.ContohImportClass;

public class Fungsi {
    public static void main(String[] args){
        int x = 2;
        int y = 2;
        int z = 2;

        tambah(x, y);
        ContohImportClass.Name("Idham");
        ContohImportClass.Name("Rafka");
    }

    public  static int tambah(int a, int b){
        int hasil = a + b;
        System.out.println("Hasil " + hasil);
        return hasil;
    }
}
