package it.euris.exam.test4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RequestSwitchReceiver switchProcessor = new SwitchProcessor();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean condition = true;
            while (condition){
                System.out.println("Inserire importo:");
                int amount = scanner.nextInt();
                System.out.println("Selezionare preferenza dei tagli: GRANDI/PICCOLI");
                String denominations = scanner.next();
                switchProcessor.switchRequest(amount, denominations);
                condition = false;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
