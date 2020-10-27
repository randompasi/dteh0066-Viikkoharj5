package fi.utu.tech.Assignment3;

import fi.utu.tech.Eläin;

public class EläinPari {
    private Eläin animal1;
    private Eläin animal2;

    public EläinPari(Eläin animal1, Eläin animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public Eläin getAnimal1() {
        return animal1;
    }

    public void setAnimal1(Eläin animal1) {
        this.animal1 = animal1;
    }

    public Eläin getAnimal2() {
        return animal2;
    }

    public void setAnimal2(Eläin animal2) {
        this.animal2 = animal2;
    }
}
