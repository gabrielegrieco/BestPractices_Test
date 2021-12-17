package it.euris.exam.test3;

public interface CarRent {

    double INSURANCE_PRICE = 100;
    double FULLTANK_PRICE = 80;

    double calcPrice();
    String getCarModel();
    boolean hasInsurance();
    boolean hasFullTank();
}

class BasicCar implements CarRent{

    private Car car;

    public BasicCar(Car c){
        this.car = c;
    }

    @Override
    public double calcPrice() {
        return car.getDailyCost() * car.getDays();
    }

    @Override
    public String getCarModel() {
        return car.getCarModel();
    }

    @Override
    public boolean hasInsurance() {
        return false;
    }

    @Override
    public boolean hasFullTank() {
        return false;
    }
}

class CarDecorator implements CarRent{

    private CarRent bCar;

    public CarDecorator(CarRent b){
        this.bCar = b;
    }

    @Override
    public double calcPrice() {
        return this.bCar.calcPrice();
    }

    @Override
    public String getCarModel() {
        return this.bCar.getCarModel();
    }

    @Override
    public boolean hasInsurance() {
        return bCar.hasInsurance();
    }

    @Override
    public boolean hasFullTank() {
        return bCar.hasFullTank();
    }
}


class CarFullTank extends CarDecorator{

    public CarFullTank(CarRent c){
        super(c);
    }

    @Override
    public double calcPrice() {
        return super.calcPrice() + FULLTANK_PRICE;
    }

    @Override
    public boolean hasFullTank() {
        return true;
    }
}

class CarInsurance extends CarDecorator{

    public CarInsurance(CarRent c){
        super(c);
    }

    @Override
    public double calcPrice() {
        return super.calcPrice() + INSURANCE_PRICE;
    }

    @Override
    public boolean hasInsurance() {
        return true;
    }
}
