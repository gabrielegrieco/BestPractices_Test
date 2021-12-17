package it.euris.exam.test3;

public interface CarFactory {

    Car getCar(String model, int days);
}

class CarFactoryImpl implements CarFactory{

    private static CarFactoryImpl _factory;

    private CarFactoryImpl(){}

    public static CarFactoryImpl getFactory(){
        if(_factory == null){
            _factory = new CarFactoryImpl();
        }
        return _factory;
    }

    @Override
    public Car getCar(String model, int days) {
        switch(model){
            case "PUNTO":
                return new Punto(days);
            case "TESLA":
                return new Tesla(days);
            case "MERCEDES":
                return new Mercedes(days);
            default:
                throw new IllegalArgumentException("Options N/A");
        }
    }
}
