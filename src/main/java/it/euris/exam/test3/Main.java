package it.euris.exam.test3;


public class Main {

    public static void main(String[] args) {
        CarRent carRental = getCarRental("MERCEDES", 15, true, true); //nomi dei modelli da scrivere in Maiuscolo

        System.out.println("CarRental model: "+carRental.getCarModel());
        System.out.println("CarRental option insurance: "+ carRental.hasInsurance());
        System.out.println("CarRental option full-tank: "+ carRental.hasFullTank());
        System.out.println("CarRental final price: "+carRental.calcPrice());
    }

    private static CarRent getCarRental(String model, int days, boolean insurance, boolean fuelTank){

        // basic car in questo caso è l'auto scelta senza costo aggiuntivo di assicurazione o serbatoio pieno
        Car auto = CarFactoryImpl.getFactory().getCar(model, days);

        CarRent autoNoleggio = new BasicCar(auto);

        if(insurance){
           autoNoleggio = new CarInsurance(autoNoleggio);
        }
        if(fuelTank){
            autoNoleggio = new CarFullTank(autoNoleggio);
        }
        return autoNoleggio;
    }


}
