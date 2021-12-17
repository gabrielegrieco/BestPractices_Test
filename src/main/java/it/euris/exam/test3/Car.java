package it.euris.exam.test3;

public interface Car {
    String getCarModel();
    int getDays();
    int getDailyCost();
}

class Punto implements Car{
    String model = "Punto";
    int days;
    int dailyCost = 15;

    public Punto(int days){
        this.days = days;
    }

    @Override
    public String getCarModel() {
        return model;
    }

    @Override
    public int getDays() {
        return days;
    }

    @Override
    public int getDailyCost() {
        return dailyCost;
    }
}

class Tesla implements Car{
    String model = "Tesla";
    int days;
    int dailyCost = 100;

    public Tesla(int days){
        this.days = days;
    }

    @Override
    public String getCarModel() {
        return model;
    }

    @Override
    public int getDays() {
        return days;
    }

    @Override
    public int getDailyCost() {
        return dailyCost;
    }
}

class Mercedes implements Car {
    String model = "Mercedes";
    int days;
    int dailyCost = 60;

    public Mercedes(int days) {
        this.days = days;
    }

    @Override
    public String getCarModel() {
        return model;
    }

    @Override
    public int getDays() {
        return days;
    }

    @Override
    public int getDailyCost() {
        return dailyCost;
    }
}