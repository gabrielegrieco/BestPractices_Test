package it.euris.exam.test4;

public class BanknotesRest500 implements Chain {


    private String bankNotesTypeProvided = "five-houdred";
    private int USED_20_BANKNOTES;

    private Bank bank = Bank.getBank();

    private Chain nextInChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(double amount) {

        // da implementare il controllo sulla disponibilità dei tagli.

        int bancUsate;
        double resto;

        if(amount < 500 ){
            nextInChain.calculate(amount);
        }

        bancUsate = (int)(amount / 500);
        USED_20_BANKNOTES =+ bancUsate;
        bank.setBanknotesRimanentiPerTipo(USED_20_BANKNOTES, bankNotesTypeProvided);

        System.out.println("Hai prelevato " + bancUsate + " banconote da 500");
        resto = amount % 500;

        if(resto > 0){
            nextInChain.calculate(resto);
        }


        else
            return;
    }
}
