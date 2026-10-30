/**
 * Tugas1
 */
import java.util.Scanner;
public class Tugas110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int total = 0;
        int i = 1;
            while (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                    total++;
                }
                System.out.println();
                i++;
            }

            System.out.println("Total angka yang tercetak: " + total);
            
        }

    }
