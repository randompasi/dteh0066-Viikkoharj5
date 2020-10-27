package fi.utu.tech;

public class Kissa extends Eläin {
    public Kissa(String nimi, int ikä) {
        super(nimi, "kissa", ikä);
    }

    // rumaa toistoa
    @Override
    public void perustaPerhe(Eläin toinen) {
        if (toinen instanceof Kissa)
            ääntele("löysin kumppanin eläimestä " + toinen);
        else
            super.perustaPerhe(toinen);
    }

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
    public int compareTo(Eläin o) {
        return this.toString().compareTo(o.toString());
    }
}