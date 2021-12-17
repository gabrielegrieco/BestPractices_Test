package it.euris.exam.test2;

public class FurnaceInput implements InputChannel{
    private String address;

    public FurnaceInput(String a){
        this.address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int read() {
        int value = (int)(50 + Math.random() * 150); // range 50 - 200
        System.out.println("Reading from "+address+" value "+value);
        return value;
    }
}
