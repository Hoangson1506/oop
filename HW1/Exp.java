package HW1;

import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        double term = 1.0;
        double sum = 0.0;
        for (int n = 1; sum != sum + term; n++) {
            sum += term;
            term *= x/n;
        }
        if (isNegative)
            sum = 1.0 / sum;
        System.out.println(sum);
        sc.close();
    }
}
