package it.euris.exam.test4;

public class BanknotesRest100 implements Chain {

    private String bankNotesTypeProvided = "one-houndred";
    private int USED_100_BANKNOTES;

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

        if(amount < 100 ){
            System.out.println("prelievo non valido, non è possibile inserire un importo minore di 100 €, grazie e arrivederci");
        }

        bancUsate = (int)(amount / 100);
        USED_100_BANKNOTES =+ bancUsate;
        bank.setBanknotesRimanentiPerTipo(USED_100_BANKNOTES, bankNotesTypeProvided);

        System.out.println("Hai prelevato " + bancUsate + " banconote da 100");
        resto = amount % 100;

        if(resto > 0){
            nextInChain.calculate(resto);
        }
        else return;
    }
}
