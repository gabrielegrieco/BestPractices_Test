package it.euris.exam.test1;

public class Sub implements Operation {

    double left;
    double right;

    public Sub(Double a, Double b) {
        this.left = a;
        this.right = b;
    }

    @Override
    public double operate() {
        double result = left - right;
        return result;
    }
}
