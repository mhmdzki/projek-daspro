import java.util.Scanner;


public class penggajiansmp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jamMengajar, tunjangan = 100000;  //input
        double gajiGuru, gajiAkhir;

        System.out.println("Masukkan gaji guru perjam");  //proses
        gajiGuru = input.nextInt();
        System.out.println("Masukkan jam guru mengajar");
        jamMengajar = input.nextInt();
        gajiAkhir = gajiGuru*jamMengajar+tunjangan;
        System.out.println(String.format("Gaji Anda adalah: %s (sudah termasuk tunjangan)",gajiAkhir));
    }
}
