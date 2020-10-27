package fi.utu.tech;

public class Kissa extends Eläin {
    public Kissa(String nimi, int ikä) {
        super(nimi, "kissa", ikä);
    }

    // rumaa toistoa


    public void mau() {
        ääntele("mau");
    }

    public void miu() {
        ääntele("miu");
    }

    @Override
    public void tervehdi() {
        mau();
    }

    @Override
    public int compareTo(Object o) {
        return this.toString().compareTo(o.toString());
    }


}