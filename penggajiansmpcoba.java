import java.util.Scanner;

public class penggajiansmpcoba {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variabel
        int  tunjangan = 1000000, percobaan = 5, jamMengajar, Jamlembur, hariMasuk; 
        double gaji, gajiLembur, total = 0;
        String username, password;

        //Sistem login
        do {
            System.out.print("Masukkan Username : ");
            username = input.next();
            System.out.print("Masukkan Password : ");
            password = input.next();

            if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
                System.out.println("Anda berhasil masuk");
                break;
            } else {
                percobaan--;
                System.out.println("Username dan password yang anda masukkan salah!");
                System.out.println("Sisa Percobaan masuk : " + percobaan);
            }            
        } while (percobaan > 0); 
        
        if (percobaan == 0) {
            System.out.println("Sisa percobaan anda telah habis, ulangi dalam 1 menit!");
        }

        int jml;
        System.out.print("Masukkan Jumlah Penggajian : ");
        jml = input.nextInt();
        int[] jmlGuru = new int[jml];
        int[] pilihanMenu = new int[jml];
        String[] nama = new String[jml];
        String[] pilihanGuru = new String[jml];
        String[] pilihanJabatan = new String[jml];
        String[] jabatan = new String[jml];
        String[] menuLembur = new String[jml];
        String[] posisiStaff = new String[jml];
        double[] gajiAkhir = new double[jml];
        double[] totalLembur = new double[jml];
    
        for (int i = 0; i < jml; i++) {

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
            pilihanMenu[i] = input.nextInt();
            
            switch (pilihanMenu[i]) {
                // Case Guru
                case 1 :
                    System.out.println("Anda berada di dalam menu guru, Silahkan pilih status guru");
                    System.out.println("1. Guru PNS");
                    System.out.println("2. Guru Honorer");
                    System.out.print("Masukkan status guru : "); 
                    pilihanGuru[i] = input.next();

                    // Pilihan Guru PNS
                    if (pilihanGuru[i].equalsIgnoreCase("1")) {
                        System.out.println("Masukkan Pilihan Jabatan");
                        System.out.println("1. Kepala Sekolah");
                        System.out.println("2. Guru Pengajar");
                        System.out.print("Masukkan Pilihan Anda : "); 
                        pilihanJabatan[i] = input.next();

                        // Menu Jabatan Kepala Sekolah (Tanpa jam Mengajar)
                        if (pilihanJabatan[i].equalsIgnoreCase("1")) {              
                            System.out.print("Masukkan Nama Guru : ");
                            nama[i] = input.next();
                            System.out.print("Masukkan Gaji Guru : ");
                            gaji = input.nextDouble();
                            
                            jabatan[i] = "Kepala Sekolah";
                            gajiAkhir[i] = gaji + tunjangan;
                            total += gajiAkhir[i]; 

                            System.out.println();
                            System.out.println("======Slip Gaji Guru Kepala Sekolah SMP======");
                            System.out.println();
                            System.out.println("Nama Guru : " + nama[i]);
                            System.out.println("Tunjangan = " + tunjangan);
                            System.out.println("Jabatan : " + jabatan[i]);
                            System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir[i]));

                        // Menu Jabatan Guru Mengajar 
                        } else if (pilihanJabatan[i].equalsIgnoreCase("2")) {
                            System.out.print("Masukkan nama guru : ");
                            nama[i] = input.next();
                            System.out.print("Masukkan gaji guru perjam : "); 
                            gaji = input.nextInt();
                            System.out.print("Masukkan jam guru mengajar : ");
                            jamMengajar = input.nextInt();

                            jabatan[i] = "Guru Pengajar";
                            gajiAkhir[i] = gaji * jamMengajar + tunjangan;
                            total += gajiAkhir[i]; 

                            System.out.println();
                            System.out.println("======Slip Gaji Guru PNS SMP======");
                            System.out.println();
                            System.out.println("Nama Guru : " + nama[i]);
                            System.out.println("Jabatan : " + jabatan[i]);
                            System.out.println("Tunjangan = " + tunjangan);
                            System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir[i]));

                        // Inputan Salah
                        }else {
                            System.out.println("Input Yang Anda Masukkan Salah");
                        }    

                    // Pilihan Guru Honorer
                    } else if (pilihanGuru[i].equalsIgnoreCase("2")) {
                        System.out.print("Masukkan nama guru : ");
                        nama[i] = input.next();
                        System.out.print("Masukkan gaji guru perjam : "); 
                        gaji = input.nextInt();
                        System.out.print("Masukkan jam guru mengajar : ");
                        jamMengajar = input.nextInt();
                        
                        //Menu Lembur
                        System.out.print("Apakah anda ingin menambah Gaji Lembur (y/t) : ");
                        menuLembur[i] = input.next();
                        if (menuLembur[i].equalsIgnoreCase("y")) {
                            System.out.print("Masukkan gaji lembur per jam : ");
                            gajiLembur = input.nextInt();
                            System.out.print ("Masukkan jam mengajar lembur : ");
                            Jamlembur = input.nextInt();

                            totalLembur[i] = Jamlembur * gajiLembur;
                            gajiAkhir[i] = (gaji * jamMengajar) + totalLembur[i] ;
                            total += gajiAkhir[i]; 

                            System.out.println();
                            System.out.println("======Slip Gaji Guru Honorer SMP======");
                            System.out.println();
                            System.out.println("Nama Guru : " + nama[i]);
                            System.out.println("Gaji lembur = " + totalLembur[i]);
                            System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir[i]));

                        } else if (menuLembur[i].equalsIgnoreCase("t")) {
                            gajiAkhir[i] = gaji * jamMengajar;
                            total += gajiAkhir[i]; 

                            System.out.println();
                            System.out.println("======Slip Gaji Guru Honorer SMP======");
                            System.out.println();
                            System.out.println("Nama Guru : " + nama[i]);
                            System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir[i]));

                        } else {
                            System.out.println("Input yang anda masukkan salah!");
                        }

                    // Inputan Status Guru Salah   
                    } else {
                        System.out.println("Status Guru yang Anda Masukkan Salah!");
                    }
                    break;

                // Case Staff
                case 2 : 
                    System.out.print("Masukkan nama staff : ");
                    nama[i] = input.next();
                    System.out.print("Masukkan posisi staff : ");
                    posisiStaff[i] = input.next();
                    System.out.print("Masukkan hari masuk staff : ");
                    hariMasuk = input.nextInt();
                    System.out.print("Masukkan gaji staff : ");
                    gaji = input.nextInt();
                    gajiAkhir[i] = (gaji * hariMasuk);
                    total += gajiAkhisr[i]; 

                    System.out.println();
                    System.out.println("======Slip Gaji Staff SMP======");
                    System.out.println();
                    System.out.println("Nama Staff : " + nama[i]);
                    System.out.println("Posisi Staff : " + posisiStaff[i]);
                    System.out.println(String.format("Total gaji anda adalah : Rp. %s ", gajiAkhir[i]));

                break;
                default : 
                    System.out.println("Menu yang anda masukkan salah! ");
            }

            
        }
        
        System.out.println();
        System.out.println("Apakah Anda ingin mencetak Laporan Penggajian Guru? (y/t) : ");
        String menuLaporan = input.next();

        if (menuLaporan.equalsIgnoreCase("y")) {
            System.out.println();
            System.out.println("======================================");
            System.out.println("||                                  ||");
            System.out.println("||      LAPORAN PENGGAJIAN GURU     ||");
            System.out.println("||                                  ||");
            System.out.println("======================================");
            System.out.println();
            System.out.println("Total Penggajian yang dilakukan = " + jmlGuru.length);
            System.out.println("Total Dana yang dikeluarkan = " + total);

        } else if (menuLaporan.equalsIgnoreCase("t")) {
            System.out.println("Penggajian Selesai");
        } else {
            System.out.println("Input yang anda masukkan salah!");
        }


        // for (int i = 0; i < jml; i++) {
        //     System.out.println("Guru ke-" + hasil);
        //     System.out.println("Nama Guru : " + nama[hasil]);
        // }    
    }
}