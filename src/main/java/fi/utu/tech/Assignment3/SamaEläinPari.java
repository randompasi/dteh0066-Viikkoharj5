package fi.utu.tech.Assignment3;

import fi.utu.tech.Eläin;


public class SamaEläinPari <A extends Eläin> extends TarkkaEläinPari {

    private A animal1;
    private A animal2;


    public  SamaEläinPari(A animal1, A animal2) {
        super(animal1,animal2);
    }

}
