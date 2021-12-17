package it.euris.exam.test2;

public class FurnaceOutput implements OutputChannel{
    private String address;

    public FurnaceOutput(String a){
        this.address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void write(int value) {
        System.out.println("Writing to "+address+" value "+value);
    }
}
