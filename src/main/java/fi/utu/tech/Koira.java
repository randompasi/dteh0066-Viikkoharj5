package fi.utu.tech;

public class Koira extends Eläin {
    public Koira(String nimi, int ikä) {
        super(nimi, "koira", ikä);
    }

    // rumaa toistoa
    @Override
    public void perustaPerhe(Eläin toinen) {
        if (toinen instanceof Koira)
            ääntele("löysin kumppanin eläimestä " + toinen);
        else
            super.perustaPerhe(toinen);
    }

    public void nouda(Esine esine) {
        System.out.println(this + " noutaa esineen " + esine + ".");
    }

    public void hau() {
        ääntele("hau");
    }

    @Override
    public void tervehdi() {
        hau();
    }

    @Override
    public int compareTo(Eläin o) {
        return this.toString().compareTo(o.toString());
    }
}