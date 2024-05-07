package Expression;

import javax.xml.transform.stream.StreamSource;

public class Main {
    public static void main(String[] args) {
        Expression numeral1 = new Numeral(10);
        Expression numeral2 = new Numeral(12);
        Expression square = new Square(numeral1);
        Expression addition = new Addition(numeral1, numeral2);
        System.out.println(numeral1);
        System.out.println(numeral2);
        System.out.println(addition);
        System.out.println(square);
    }
}
