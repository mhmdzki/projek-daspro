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

System.out.print("Masukkan nama staff : ");
                    nama[i] = input.next();
                    System.out.println("Pilih posisi staff : ");
                    System.out.println("1. Staff TU ");
                    System.out.println("2. Staff Perpustakaan ");
                    System.out.println("3. Staff Office Boy (OB) ");
                    System.out.println("4. Staff Security ");
                    System.out.print("Masukkan Pilihan Anda : ");
                    posisiStaff[i] = input.next();
                    // if (posisiStaff[i].equalsIgnoreCase(1)) {
                        
                    // }
                    System.out.print("Masukkan hari masuk staff : ");
                    int hariMasukStaff = input.nextInt();
                    System.out.print("Masukkan gaji staff : ");
                    int gajiStaff = input.nextInt();
                    gajiAkhir[i] = (gaji * hariMasuk);
                    total += gajiAkhir[i]; 

                    System.out.println();
                    System.out.println("======Slip Gaji Staff SMP======");
                    System.out.println();
                    System.out.println("Nama Staff : " + nama[i]);
                    System.out.println("Posisi Staff : " + posisiStaff[i]);
                    System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir[i]));
