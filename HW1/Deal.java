package HW1;

import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(i % 5 == 0 && i != 0) {
                System.out.println("");
            }
            System.out.print(a[i] + " ");                           


                
        }
        scanner.close();
    }
}
