package it.euris.exam.test4;

public class BanknotesRest10 implements Chain {


    private String bankNotesTypeProvided = "ten";
    private int USED_10_BANKNOTES;

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

        if(amount < 10 && amount != 0 ){
            nextInChain.calculate(amount);
        }
            else{
            bancUsate = (int)(amount / 10);
            USED_10_BANKNOTES =+ bancUsate;
            bank.setBanknotesRimanentiPerTipo(USED_10_BANKNOTES, bankNotesTypeProvided);
            System.out.println("Hai prelevato " + bancUsate + " banconote da 10");
            resto = amount % 10;

            if(resto > 0){
                nextInChain.calculate(resto);
            }
            else if(resto == 0){
                System.out.println("grazie e arrivederci");
            };
        }

    }
}
