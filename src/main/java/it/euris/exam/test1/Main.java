package it.euris.exam.test1;

public class Main {

    public static void main(String[] args) {

        Double a = 2.0;
        Double b = 4.0;

        Calc calc = new Calc();
        calc.calculate( new Add (a, b));
        calc.calculate( new Sub (a, b));
    }
}
