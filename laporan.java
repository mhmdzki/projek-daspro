       int[] totalGuru = new int[jmlGuru];
       
       total += gajiAkhir[i];

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
            System.out.println("Total Penggajian yang dilakukan = " + totalGuru.length);
            System.out.println("Total Dana yang dikeluarkan = " + total);

        } else if (menuLaporan.equalsIgnoreCase("t")) {
            System.out.println("Penggajian Selesai");
        } else {
            System.out.println("Input yang anda masukkan salah!");
        }


        for (int i = 0; i < jml; i++) {
            System.out.println("Guru ke-" + hasil);
            System.out.println("Nama Guru : " + nama[hasil]);
        }    