import java.util.Scanner;

public class fitur_eks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah guru Eksternal : ");
        int jmlEks = sc.nextInt();

        String lapEks[][] = new String[jmlEks][3];

        for (int i = 0; i < lapEks.length; i++) {
            System.out.println("Guru Eksternal ke-" + (i+1));
            for (int j = 0; j < lapEks[0].length; j++) {
                if (j == 0) {
                    System.out.print("Nama" + ": ");
                    lapEks[i][j] = sc.next();
                } else if (j == 1) {
                    System.out.print("Posisi" + ": ");
                    lapEks[i][j] = sc.next();
                } else {
                    System.out.print("Gaji" + ": ");
                    lapEks[i][j] = sc.next();
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("======================================");
        System.out.println("||                                  ||");
        System.out.println("||   LAPORAN PENGGAJIAN EKSTERNAL   ||");
        System.out.println("||                                  ||");
        System.out.println("======================================");
        System.out.println();

        for (int i = 0; i < lapEks.length; i++) {
            System.out.println("Guru Eksternal ke-" + (i+1) + ": ");
            for (String out : lapEks[i]) {
                System.out.print(out + " \t - \t ");
            }
            System.out.println();
        }
    sc.close();   
    }
}
