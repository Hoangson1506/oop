package HW1;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double temp = x*x + y*y;
        double result = Math.sqrt(temp);
        System.out.println(result);
        scanner.close();
    }
}
