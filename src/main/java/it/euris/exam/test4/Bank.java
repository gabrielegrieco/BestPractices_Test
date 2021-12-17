package it.euris.exam.test4;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Bank {

    private static Bank instance = new Bank();

    private static int TOTAL_20_BANKNOTES = 100;
    private static int TOTAL_10_BANKNOTES = 100;
    private static int TOTAL_5_BANKNOTES = 100;
    private static int TOTAL_1_BANKNOTES = 100;

    private static int USED_20_BANKNOTES;
    private static int USED_10_BANKNOTES;
    private static int USED_5_BANKNOTES;
    private static int USED_1_BANKNOTES;

    private Bank(){}

    public static Bank getBank(){
        return instance;
    }

    public void setBanknotesRimanentiPerTipo(int banknotesRimanenti, String tipo){
        switch (tipo){
            case  "twenty" : USED_20_BANKNOTES = banknotesRimanenti;

            case  "ten" : USED_10_BANKNOTES = banknotesRimanenti;

            case "five" : USED_5_BANKNOTES = banknotesRimanenti;

            case "one" : USED_1_BANKNOTES = banknotesRimanenti;
        }
    }
}
