import java.util.Scanner;

public class Pengulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih pola yang ingin ditampilkan:");
        System.out.println("1. Pola Segitiga Bintang Bertambah");
        System.out.println("2. Pola Angka Bertambah Secara Horizontal");
        System.out.println("3. Pola Angka Zig-Zag");
        System.out.println("4. Pola -1 dan 0");
        System.out.println("5. Pola Gabungan Bintang dan Angka");
        System.out.print("Masukkan pilihan (1-5): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                printPattern1();
                break;
            case 2:
                printPattern2();
                break;
            case 3:
                printPattern3();
                break;
            case 4:
                printPattern4();
                break;
            case 5:
                printPattern5();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
    
    // Pilihan 1: Segitiga Bertambah
    public static void printPattern1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pilihan 2: Angka Bertambah Secara Horizontal
    public static void printPattern2() {
        int num = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            num++;
        }
    }

    // Pilihan 3: Angka Zig-Zag
    public static void printPattern3() {
        int[][] pattern = {
            {1, 2, 3, 4, 5},
            {20, 19, 18, 17, 16},
            {6, 7, 8, 9, 10},
            {15, 14, 13, 12, 11}
        };
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Pilihan 4: -1 dan 0
    public static void printPattern4() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("-1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // Pilihan 5: Gabungan Bintang dan Angka
    public static void printPattern5() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
