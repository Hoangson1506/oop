package HW1;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String numbers[] = line.split(" ");
        for(int i=0; i<numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            if(num > max) max = num;
            if(num < min) min = num;
        }
        System.out.println(max);
        System.out.println(min);
    }
}