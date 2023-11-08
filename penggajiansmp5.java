import java.util.Scanner;

public class penggajiansmp5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // input
        int  tunjangan = 10000, percobaan = 5, jamMengajar, Jamlembur, pilihanMenu, hariMasuk; 
        double gaji, gajiAkhir, gajiLembur, totalLembur, gajiStaff = 50000;
        String nama, pilihanGuru, menuLembur, posisiStaff, jabatan, pilihanJabatan, username, password;

        // System login
        // do {
        //     System.out.print("Masukkan Username : ");
        //     username = input.next();
        //     System.out.print("Masukkan Password : ");
        //     password = input.next();

        //     if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
        //         System.out.println("Anda berhasil masuk");
        //         break;
        //     } else {
        //         percobaan--;
        //         System.out.println("Username dan password yang anda masukkan salah!");
        //         System.out.println("Sisa Percobaan masuk : " + percobaan);
        //     }            
        // } while (percobaan > 0); 
        
        // if (percobaan == 0) {
        //     System.out.println("Sisa percobaan anda telah habis, ulangi dalam 1 menit!");
        // }

        // Pilihan Menu
        System.out.println();
        System.out.println("======================================");
        System.out.println("||                                  ||");
        System.out.println("||      SISTEM PENGGAJIAN GURU      ||");
        System.out.println("||                                  ||");
        System.out.println("======================================");
        System.out.println();
        System.out.println("Selamat Datang di Sistem Penggajian Guru SMP");
        System.out.println();
        System.out.println("Silahkan Pilih Menu Penggajian (Pilih salah satu!) ");
        System.out.println("1. Guru");
        System.out.println("2. Staff");
        System.out.print("Masukkan pilihan anda : ");
        pilihanMenu = input.nextInt();
        
        switch (pilihanMenu) {
            // Case Guru
            case 1 :
                System.out.print("Masukkan jumlah Guru : ");
                int jmlGuru = input.nextInt();

                String daftarGuru[][] = new String[jmlGuru][2];
                double daftarGajiGuru[] = new double[jmlGuru];

                for (int i = 0; i < daftarGuru.length; i++) {
                    System.out.println();
                    System.out.println("Anda berada di dalam menu guru, Silahkan pilih status guru");
                    System.out.println("1. Guru PNS");
                    System.out.println("2. Guru Honorer");
                    System.out.print("Masukkan status guru : "); 
                    pilihanGuru = input.next();

                    // Pilihan Guru PNS
                    if (pilihanGuru.equalsIgnoreCase("1")) {
                        System.out.println("Masukkan Pilihan Jabatan");
                        System.out.println("1. Kepala Sekolah");
                        System.out.println("2. Guru Pengajar");
                        System.out.print("Masukkan Pilihan Anda : "); 
                        pilihanJabatan = input.next();

                        // Menu Jabatan Kepala Sekolah (Tanpa jam Mengajar)
                        if (pilihanJabatan.equalsIgnoreCase("1")) {              
                            System.out.print("Masukkan Nama Guru : ");
                            nama = input.next();
                            System.out.print("Masukkan Gaji Guru : ");
                            gaji = input.nextDouble();
                            
                            jabatan = "Kepala Sekolah";
                            gajiAkhir = gaji + tunjangan;
                            daftarGuru[i][0] = nama;
                            daftarGuru[i][1] = jabatan;
                            daftarGajiGuru[i] = gajiAkhir;

                            System.out.println();
                            System.out.println("======Slip Gaji Guru Kepala Sekolah======");
                            System.out.println();
                            System.out.println("Nama Guru : " + nama);
                            System.out.println("Tunjangan = " + tunjangan);
                            System.out.println("Jabatan : " + jabatan);
                            System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir));

                        // Menu Jabatan Guru Mengajar 
                        } else if (pilihanJabatan.equalsIgnoreCase("2")) {
                            System.out.print("Masukkan nama guru : ");
                            nama = input.next();
                            System.out.print("Masukkan gaji guru perjam : "); 
                            gaji = input.nextInt();
                            System.out.print("Masukkan jam guru mengajar : ");
                            jamMengajar = input.nextInt();

                            jabatan = "Guru Pengajar";
                            gajiAkhir = gaji * jamMengajar + tunjangan;
                            daftarGuru[i][0] = nama;
                            daftarGuru[i][1] = jabatan;
                            daftarGajiGuru[i] = gajiAkhir;

                            System.out.println();
                            System.out.println("======Slip Gaji Guru PNS======");
                            System.out.println();
                            System.out.println("Nama Guru : " + nama);
                            System.out.println("Jabatan : " + jabatan);
                            System.out.println("Tunjangan = " + tunjangan);
                            System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir));

                        // Inputan Salah
                        }else {
                            System.out.println("Input Yang Anda Masukkan Salah");
                        }    

                    // Pilihan Guru Honorer
                    } else if (pilihanGuru.equalsIgnoreCase("2")) {
                        System.out.print("Masukkan nama guru : ");
                        nama = input.next();
                        System.out.print("Masukkan gaji guru perjam : "); 
                        gaji = input.nextInt();
                        System.out.print("Masukkan jam guru mengajar : ");
                        jamMengajar = input.nextInt();
                        
                        //Menu Lembur
                        System.out.println("Apakah anda ingin menambah Gaji Lembur (y/t)");
                        menuLembur = input.next();
                        if (menuLembur.equalsIgnoreCase("y")) {
                            System.out.print("Masukkan gaji lembur per jam : ");
                            gajiLembur = input.nextInt();
                            System.out.print ("Masukkan jam mengajar lembur : ");
                            Jamlembur = input.nextInt();

                            jabatan = "Honorer\t";
                            totalLembur = Jamlembur * gajiLembur;
                            gajiAkhir = (gaji * jamMengajar) + totalLembur;
                            daftarGuru[i][0] = nama;
                            daftarGuru[i][1] = jabatan;
                            daftarGajiGuru[i] = gajiAkhir;

                            System.out.println();
                            System.out.println("======Slip Gaji Guru Honorer======");
                            System.out.println();
                            System.out.println("Nama Guru : " + nama);
                            System.out.println("Gaji lembur = " + totalLembur);
                            System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir));

                        } else if (menuLembur.equalsIgnoreCase("t")) {
                            jabatan = "Honorer";
                            gajiAkhir = gaji * jamMengajar;
                            daftarGuru[i][0] = nama;
                            daftarGuru[i][1] = jabatan;
                            daftarGajiGuru[i] = gajiAkhir;

                            System.out.println();
                            System.out.println("======Slip Gaji Guru Honorer======");
                            System.out.println();
                            System.out.println("Nama Guru : " + nama);
                            System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir));
                        } else {
                            System.out.println("Input yang anda masukkan salah!");
                        }

                    // Inputan Status Guru Salah   
                    } else {
                        System.out.println("Status Guru yang Anda Masukkan Salah!");
                    }
                }
                
                System.out.println();
                System.out.println("Laporan");
                System.out.println();

                for (int i = 0; i < daftarGuru.length; i++) {
                    System.out.println("Staff ke-" + (i+1) + ": " + daftarGuru[i][0] + "\t - \t" + daftarGuru[i][1] + "\t - \tTotal Gaji: Rp. " + daftarGajiGuru[i]);
                }

                break;

            // Case Staff
            case 2 : 

                System.out.print("Masukkan jumlah Staff : ");
                int jmlStaff = input.nextInt();

                String daftarStaff[][] = new String[jmlStaff][2];
                double daftarGajiStaff[] = new double[jmlStaff];

                for (int i = 0; i < daftarStaff.length; i++) {
                    System.out.println();
                    System.out.print("Masukkan nama staff : ");
                    nama = input.next();
                    System.out.println("POSISI STAFF SMP");
                    System.out.println("1. Security");
                    System.out.println("2. Office Boy");
                    System.out.println("3. Petugas Perpustakaan");
                    System.out.println("4. Tata Usaha");
                    System.out.print("Masukkan pilihan posisi staff : ");
                    int menuStaff = input.nextInt();
                    System.out.print("Masukkan hari masuk staff : ");
                    hariMasuk = input.nextInt();;

                    switch (menuStaff) {
                        case 1:
                            posisiStaff = "Security";

                            gajiAkhir = (gajiStaff * hariMasuk);
                            daftarStaff[i][0] = nama;
                            daftarStaff[i][1] = posisiStaff;
                            daftarGajiStaff[i] = gajiAkhir;

                            System.out.println();
                            System.out.println("======Slip Gaji Staff SMP Tadika Mesra======");
                            System.out.println();
                            System.out.println("Nama Staff : " + nama);
                            System.out.println("Posisi Staff : " + posisiStaff);
                            System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir));
                            break;

                        case 2:
                            posisiStaff = "Office Boy";

                            gajiAkhir = (gajiStaff * hariMasuk);
                            daftarStaff[i][0] = nama;
                            daftarStaff[i][1] = posisiStaff;
                            daftarGajiStaff[i] = gajiAkhir;

                            System.out.println();
                            System.out.println("======Slip Gaji Staff SMP Tadika Mesra======");
                            System.out.println();
                            System.out.println("Nama Staff : " + nama);
                            System.out.println("Posisi Staff : " + posisiStaff);
                            System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir));
                            break;

                        case 3:
                            posisiStaff = "Petugas Perpustakaan";

                            gajiAkhir = (gajiStaff * hariMasuk);
                            daftarStaff[i][0] = nama;
                            daftarStaff[i][1] = posisiStaff;
                            daftarGajiStaff[i] = gajiAkhir;

                            System.out.println();
                            System.out.println("======Slip Gaji Staff SMP Tadika Mesra======");
                            System.out.println();
                            System.out.println("Nama Staff : " + nama);
                            System.out.println("Posisi Staff : " + posisiStaff);
                            System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir));
                            break;

                        case 4:
                            posisiStaff = "Tata Usaha";

                            gajiAkhir = (gajiStaff * hariMasuk);
                            daftarStaff[i][0] = nama;
                            daftarStaff[i][1] = posisiStaff;
                            daftarGajiStaff[i] = gajiAkhir;

                            System.out.println();
                            System.out.println("======Slip Gaji Staff SMP Tadika Mesra======");
                            System.out.println();
                            System.out.println("Nama Staff : " + nama);
                            System.out.println("Posisi Staff : " + posisiStaff);
                            System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir));
                            break;
                    
                        default:
                            break;
                    }

                } 

                System.out.println();
                System.out.println("Laporan");
                System.out.println();

                for (int i = 0; i < daftarStaff.length; i++) {
                    System.out.println("Staff ke-" + (i+1) + ": " + daftarStaff[i][0] + "\t - \t" + daftarStaff[i][1] + "\t - \tTotal Gaji: Rp. " + daftarGajiStaff[i]);
                }

            break;
            default : 
                System.out.println("Menu yang anda masukkan salah! ");
        }

    }
}