package it.euris.exam.test4;

public class BanknotesRest1 implements Chain {


    private String bankNotesTypeProvided = "one";
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

        if(amount < 1){
            System.out.println("prelievo non valido, non è possibile inserire un importo minore di 1 €, grazie e arrivederci");
        }
        else{
            bancUsate = (int)(amount / 1);
            USED_20_BANKNOTES =+ bancUsate;
            bank.setBanknotesRimanentiPerTipo(USED_20_BANKNOTES, "one");
            System.out.println("Hai prelevato " + bancUsate + " banconote da 1");
            resto = amount % 1;

            if(resto > 0){
                nextInChain.calculate(resto);
            }
            else if(resto == 0){
                System.out.println("grazie e arrivederci");
            };
        }
    }
}
