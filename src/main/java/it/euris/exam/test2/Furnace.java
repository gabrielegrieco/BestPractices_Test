package it.euris.exam.test2;

public class Furnace {

    private final String THERMOMETER = "0x86"; // I/O address
    private final String FURNACE = "0x87"; // I/O address
    private final int ENGAGE = 1;
    private final int DISENGAGE = 0;

    // Notare come la policy dipende dai dettagli di basso livello
    public void regulate(double minTemp, double maxTemp) {
        InputChannel input = new FurnaceInput(THERMOMETER);
        OutputChannel output = new FurnaceOutput(FURNACE);

        try {
            while (input.read() > minTemp)
                Thread.sleep(2000);
            output.write(ENGAGE);
            while (input.read() < maxTemp)
                Thread.sleep(2000);
            output.write(DISENGAGE);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
