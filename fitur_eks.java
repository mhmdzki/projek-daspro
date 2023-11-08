import java.util.Scanner;

public class fitur_eks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah guru : ");
        int guru = sc.nextInt();

        String temps[][] = new String[guru][3];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Guru ke-" + (i+1));
            for (int j = 0; j < temps[0].length; j++) {
                if (j == 0) {
                    System.out.print("Nama" + ": ");
                    temps[i][j] = sc.next();
                } else if (j == 1) {
                    System.out.print("Posisi" + ": ");
                    temps[i][j] = sc.next();
                } else {
                    System.out.print("Gaji" + ": ");
                    temps[i][j] = sc.next();
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

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Guru ke-" + (i+1) + ": ");
            for (String out : temps[i]) {
                System.out.print(out + " \t - \t ");
            }
            System.out.println();
        }
    sc.close();   
    }
}
