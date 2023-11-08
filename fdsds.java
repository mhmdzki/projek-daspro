public class fdsds {
    public static void main(String[] args) {


        char[] huruf = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o'};
        int k = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                    System.out.print(huruf[k]);
                    k += 4;
                }
            k = i + 1;
            System.out.println();
        }
    }
    
}
