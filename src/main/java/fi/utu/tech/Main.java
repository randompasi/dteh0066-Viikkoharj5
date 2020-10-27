package fi.utu.tech;

import fi.utu.tech.Assignment1.Eläinjoukko;
import fi.utu.tech.Assignment1.JärjestettyEläinjoukko;

import java.util.Collection;


/**
 * holds all the example for assignments
 */

public class Main {
    public static void main(String[] args) {
        assignmentLine(1);
        var a = new Kissa("Misse", 5);
        var b = new Kissa("Mirri", 10);
        var c = new Koira("Musti", 1);
       var eläinjoukko = new Eläinjoukko<Eläin>();
       eläinjoukko.add(a);
       eläinjoukko.add(b);
       eläinjoukko.add(c);
        System.out.println(eläinjoukko.size());
       eläinjoukko.add(a);
        System.out.println(eläinjoukko.size());
       eläinjoukko.add(new Kissa("Misse",5));
        System.out.println(eläinjoukko.size());
//        a.tervehdi();
//        b.miu();
//        c.tervehdi();
//        c.nouda(new Keppi());
        System.out.println(eläinjoukko);
        var järjestettyEläinJoukko = new JärjestettyEläinjoukko<Eläin>();
        järjestettyEläinJoukko.add(a);
        järjestettyEläinJoukko.add(b);
        järjestettyEläinJoukko.add(c);
        järjestettyEläinJoukko.add(new Kissa("Fakta", 1));
        järjestettyEläinJoukko.add(new Koira("Andy", 10));
        for (var eläin : järjestettyEläinJoukko){
            System.out.println(eläin);
        }
        assignmentLine(2);
        tervehdi(eläinjoukko);
            tervehdi(järjestettyEläinJoukko);
        var eläinjoukkoKoira = new Eläinjoukko<Koira>();
        Eläin<Koira> koira = new Koira("Musti", 1);
           var koira2 = new Koira("Andy", 10);
        var koira3 = new Koira("Max", 8);
        eläinjoukkoKoira.add(koira2);
        eläinjoukkoKoira.add(koira3);

        var eläinjoukkoKissa = new Eläinjoukko<Kissa>();
        var kissa = new Kissa("Musti", 1);
        var kissa2 = new Kissa("Andy", 10);
        var kissa3 = new Kissa("Max", 8);
        eläinjoukkoKissa.add(kissa);
        eläinjoukkoKissa.add(kissa2);
        eläinjoukkoKissa.add(kissa3);

        nouto(eläinjoukkoKoira);
        tervehdi(eläinjoukkoKoira);
        tervehdi(eläinjoukkoKissa);

koira.perustaPerhe(koira2);
koira.perustaPerhe(kissa);// java: incompatible types: fi.utu.tech.Kissa cannot be converted to fi.utu.tech.Koira is the error when try to use wrong kind of variable


        assignmentLine(3);



    }

    private static void assignmentLine(int number){
        System.out.println();
        System.out.println("---------------------------Assignment "+ number +"-----------------------------");
    }

    private static <E> void  tervehdi(Collection<? extends Eläin> animals) {
        animals.forEach(it->it.tervehdi());

    }

    private static void  nouto(Collection<Koira> animals) {
        Keppi keppi = new Keppi();
        animals.forEach(it->it.nouda(keppi));
    }


}