import java.util.Scanner;

public class Triangle25 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 1 ; // perubahan 1 dari 0 menjadi 1
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // perubahan 2
            i++;
        }
        System.out.println(); // memberi jarak spasi antar segitiga
        
        //langlah 8
        i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--; // menggunakan decrement karena nilainya dikurangi dari n ke 1
        }
        sc.close();
    }
    
}
