package it.euris.exam.test2;

public class Main {

    public static void main(String[] args) {
        Furnace furnace = new Furnace();
        while (true){
            furnace.regulate(100, 150);
        }
    }

}
