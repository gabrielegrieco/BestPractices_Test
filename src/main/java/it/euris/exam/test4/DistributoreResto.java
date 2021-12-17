package it.euris.exam.test4;

public class DistributoreResto {

    private static DistributoreResto instance = new DistributoreResto();

    private DistributoreResto(){}

    public static DistributoreResto getDistributoreResto(){
        return instance;
    }

    public void monopolyBanknotesProviderGrandi(int amount){

        Chain chainProvider1 = new BanknotesRest500();
        Chain chainProvider2 = new BanknotesRest200();
        Chain chainProvider3 = new BanknotesRest100();

        chainProvider1.setNextChain(chainProvider2);
        chainProvider2.setNextChain(chainProvider3);

        chainProvider1.calculate(amount);

    /*
        int bancUsate;
        double resto;

        bancUsate = amount / 20;
        USED_20_BANKNOTES =+ bancUsate;
        System.out.println("Hai prelevato " + bancUsate + " banconote da 20");
        resto = amount % 20;

        if (resto > 0){
            bancUsate = (int) (resto / 10); //downcast tronca i decimali
            USED_10_BANKNOTES =+ bancUsate;
            System.out.println("Hai prelevato " + bancUsate + " banconote da 10");
            resto = resto % 10;
        }
        else
            return;

        if (resto > 0){
            bancUsate = (int) (resto / 5); //downcast tronca i decimali
            USED_5_BANKNOTES =+ bancUsate;
            System.out.println("Hai prelevato " + bancUsate + " banconote da 5");
            resto = resto % 5;
        }
        else
            return;


        if (resto > 0){
            bancUsate = (int) (resto); //downcast tronca i decimali
            USED_1_BANKNOTES =+ bancUsate;
            System.out.println("Hai prelevato " + bancUsate + " banconote da 1");
        }
        else
            return;
    */

    }

    public void monopolyBanknotesProviderPiccoli(int amount){

        Chain chainProvider1 = new BanknotesRest50();
        Chain chainProvider2 = new BanknotesRest20();
        Chain chainProvider3 = new BanknotesRest10();
        Chain chainProvider4 = new BanknotesRest5();
        Chain chainProvider5 = new BanknotesRest1();

        chainProvider1.setNextChain(chainProvider2);
        chainProvider2.setNextChain(chainProvider3);
        chainProvider3.setNextChain(chainProvider4);
        chainProvider4.setNextChain(chainProvider5);

        chainProvider1.calculate(amount);

        /*
        int bancUsate;
        double resto;

        bancUsate = amount / 20;
        USED_20_BANKNOTES =+ bancUsate;
        System.out.println("Hai prelevato " + bancUsate + " banconote da 20");
        resto = amount % 20;

        if (resto > 0){
            bancUsate = (int) (resto / 10); //downcast tronca i decimali
            USED_10_BANKNOTES =+ bancUsate;
            System.out.println("Hai prelevato " + bancUsate + " banconote da 10");
            resto = resto % 10;
        }
        else
            return;

        if (resto > 0){
            bancUsate = (int) (resto / 5); //downcast tronca i decimali
            USED_5_BANKNOTES =+ bancUsate;
            System.out.println("Hai prelevato " + bancUsate + " banconote da 5");
            resto = resto % 5;
        }
        else
            return;


        if (resto > 0){
            bancUsate = (int) (resto); //downcast tronca i decimali
            USED_1_BANKNOTES =+ bancUsate;
            System.out.println("Hai prelevato " + bancUsate + " banconote da 1");
        }
        else
            return;
    */
    }

}
