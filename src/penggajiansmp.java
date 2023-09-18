import java.util.Scanner;
public class penggajiansmp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int  tunjangan = 10000; // input
        int gajiGuru, gajiAkhir, jamMengajar;
        String namaGuru;

        System.out.println("Masukkan gaji guru perjam"); // proses
        gajiGuru = input.nextInt();
        System.out.println("Masukkan jam guru mengajar");
        jamMengajar = input.nextInt();
        System.out.println("Masukkan nama guru");
        namaGuru = input.next();
        gajiAkhir = gajiGuru * jamMengajar + tunjangan;
        System.out
                .println(String.format("Gaji Guru %s Anda adalah: %s (sudah termasuk tunjangan)", namaGuru, gajiAkhir));
    }
}