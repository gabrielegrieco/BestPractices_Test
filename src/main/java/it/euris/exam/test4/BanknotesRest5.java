package it.euris.exam.test4;

public class BanknotesRest5 implements Chain {


    private String bankNotesTypeProvided = "five";
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

        if(amount < 5 && amount != 0){
            nextInChain.calculate(amount);
        }
        else{
            bancUsate = (int)(amount / 5);
            USED_20_BANKNOTES =+ bancUsate;
            bank.setBanknotesRimanentiPerTipo(USED_20_BANKNOTES, "five");
            System.out.println("Hai prelevato " + bancUsate + " banconote da 5");
            resto = amount % 5;

            if(resto > 0){
                nextInChain.calculate(resto);
            }
            else if(resto == 0) {
                System.out.println("grazie e arrivederci");
            }
        }
    }
}
