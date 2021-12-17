package it.euris.exam.test4;

public interface RequestSwitchReceiver {
    void switchRequest(int amount,String denominations);
    void switchRequest(int amount, String denomination, String nationality);
}

class SwitchProcessor implements RequestSwitchReceiver{
    @Override
    public void switchRequest(int amount, String denominations) {
        switch (denominations){
            case "GRANDI":
                DistributoreResto.getDistributoreResto().monopolyBanknotesProviderGrandi(amount);
                break;
            case "PICCOLI":
                DistributoreResto.getDistributoreResto().monopolyBanknotesProviderPiccoli(amount);
                break;
            default:
                throw new IllegalArgumentException("SCELTA NON VALIDA");
        }
    }

    @Override
    public void switchRequest(int amount, String denomination, String nationality) {
        // se vorrò introdurre una funzione in base alla valuta
    }
}
