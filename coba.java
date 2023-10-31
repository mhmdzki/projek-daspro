import java.util.*;

public class coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("s1 : ");
        int s1 = sc.nextInt();
        System.out.print("s2 : ");
        int s2 = sc.nextInt();
        System.out.print("s3 : ");
        int s3 = sc.nextInt();
        System.out.print("s4 : ");
        int s4 = sc.nextInt();

        if (s1 == s2 && s2 == s3 && s3 == s4) {
            System.out.println("persegi");
        } else if (s1 == s3 && s2 == s4) {
            System.out.println("persegi panjang");
        } else {
            System.out.println("tidak beraturan");
        }
    }    
}