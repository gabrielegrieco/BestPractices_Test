package it.euris.exam.test1;


class Add implements Operation {

    double left;
    double right;

    public Add(double left, double right){
        this.left = left;
        this.right = right;
    }

    @Override
    public double operate() {
        double result = left + right;
        return result;
    }
}