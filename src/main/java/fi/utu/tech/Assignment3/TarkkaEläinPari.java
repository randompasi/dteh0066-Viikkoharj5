package fi.utu.tech.Assignment3;

import fi.utu.tech.Eläin;

public class TarkkaEläinPari<A extends Eläin, B extends Eläin> extends EläinPari {

    private  A animal1;
    private  B animal2;




    public TarkkaEläinPari(A animal1, B animal2) {
        super(animal1, animal2);
    }
}
