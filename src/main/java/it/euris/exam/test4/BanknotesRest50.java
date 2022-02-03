package it.euris.exam.test4;

public class BanknotesRest50 implements Chain {



    private String bankNotesTypeProvided = "fifty";
    private int USED_50_BANKNOTES;

    private Bank bank = Bank.getBank();

    private Chain nextInChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(double amount) {

        // da implementare il controllo sulla disponibilità dei tagli.

        // trial commit

        int bancUsate;
        double resto;

        if(amount < 50 && amount != 0 ){
            nextInChain.calculate(amount);
        }

        bancUsate = (int)(amount / 50);
        USED_50_BANKNOTES =+ bancUsate;
        bank.setBanknotesRimanentiPerTipo(USED_50_BANKNOTES, bankNotesTypeProvided);
        System.out.println("Hai prelevato " + bancUsate + " banconote da 50");
        resto = amount % 50;

        if(resto > 0){
            nextInChain.calculate(resto);
        }
        else if(resto == 0){
            System.out.println("grazie e arrivederci");
        };
    }
}
